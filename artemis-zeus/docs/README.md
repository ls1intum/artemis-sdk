# Zeus

The introduction of a data entry tool like Zeus serves to **streamline** and **automate** the creation of test data for
Artemis.

This approach eliminates the potential for errors when manually creating test data and prevents reaching an illegal test
data state, further enhancing the overall robustness of the testing process.
Moreover, the tool ensures consistency in test data across various testing methods.
It establishes a **standardized data set for all test environments** and enables the creation of customized data structures
tailored to specific testing scenarios, including automated E2E testing.



## Architecture

![Top-Level System Architecture (component diagram)](https://github.com/ls1intum/artemis-sdk/raw/main/artemis-zeus/docs/images/ArchitectureWithTestdataClient.drawio.png "Top-Level System Architecture (component diagram)") <br>
*Top-Level System Architecture (component diagram)*

![Zeus System Architecture (component diagram)](https://github.com/ls1intum/artemis-sdk/raw/main/artemis-zeus/docs/images/ArchitectureTestdataClient.drawio.png "Zeus System Architecture (component diagram)") <br>
*Zeus System Architecture (component diagram)*

Zeus utilizes the **Artemis Application Server API**.
The **Data Service** subsystem is responsible for generating and processing data entries received through commands
from the CLI.
The subsystem **Artemis Client SDK** provides the Artemis data structure and client methods for communication
with the Artemis API.

We cannot manually maintain an additional client alongside the Artemis Application Client to ensure maintainability.
Instead, we have adopted an API client generation approach that automatically generates the client code based
on the API design.
To accomplish this, we utilized the Artemis API to generate an **OpenAPI specification** describing the API Design.
An **OpenAPI gradle plugin** generates the OpenAPI specification.
Then the **OpenAPI Generator** consumes the generated specification and produces Java client code.
Due to the proficiency of most Artemis developers in Java, we chose it as the programming language for Zeus.



## Build and run Zeus

Either build and start a Docker container (see Docker section below) or use gradle if you just want to run the program
for development purposes use: <br>
```
./gradlew run --args="--help"
```



## Docker

You can build and run Zeus with Docker.

### Build Docker Image
```
docker build . -t ghcr.io/ls1intum/artemis-sdk:latest
```

### Docker Networking
In the following documentation `host.docker.internal` and the port `54321` is used to connect to Artemis as a workaround.

`host.docker.internal` points at your localhost and the port `54321` is used as it provides access to Artemis without
TLS as the artemis self-signed development certificate doesn't include `host.docker.internal` as hostname yet.

### Start Zeus inside a container
Before you have to build the Docker Image as shown above.

Then start Zeus using this command: <br>
```
docker run --rm -it ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 COMMAND
```

Another example showing all available commands as you can see you can omit zeus and start with its arguments:
```
docker run --rm -it ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 --help
```

On Linux append the host `host.docker.internal`: <br>
```
docker run --rm -it --add-host=host.docker.internal:host-gateway ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 COMMAND
```



## Compile GraalVM Image (Packaging)

This didn't work yet with all commands and is therefore just documented if someone else want to get it running
with GraalVM later on.

The problem was that not all data types were known during compilation and therefore the GraalVM build failed.
It might be possible to run GraalVM with some agent to detect these data types before and then add these during
compilation.

Setup local GraalVM (for example unpack it at /opt/graalvm-ce-java17-22.3.1) and export it's path before running gradle:
```
export JAVA_HOME=/opt/graalvm-ce-java17-22.3.1      
export PATH=/opt/graalvm-ce-java17-22.3.1/bin:$PATH

./gradlew nativeCompile #to build the executable
```



## Update Zeus's Artemis Client SDK Component

Zeus uses the Artemis Client SDK to access Artemis entities which is generated and needs to be updated whenever Artemis
entities used by Zeus change!

The following describes the workflow on how to do this:

![Update Zeus’s Artemis Client SDK (activity diagram)](https://github.com/ls1intum/artemis-sdk/raw/main/artemis-zeus/docs/images/ActivityDiagramUpdatingZeus.drawio.png "Update Zeus’s Artemis Client SDK (activity diagram)") <br>
*Update Zeus’s Artemis Client SDK (activity diagram)*

### Update Artemis API Code
A developer changes Artemis code which changes the data entities or how the API works which makes it necessary to
generate a new Artemis Client SDK if these API calls or entities are used in Zeus.

### Generate new OpenAPI Specification
The first step is generating a new OpenAPI specification inside the Artemis project.

The [branch feature/openapi-generation inside the Artemis project](https://github.com/ls1intum/Artemis/compare/develop...feature/openapi-generation)
contains the changes necessary to generate an OpenAPI specification working with this version of Zeus.

In case the branch got deleted we stored patch files in the directory `openapi-generation-patches` of this project.

Mostly the Artemis project is missing Schema annotations which provide the metadata necessary to generate a correct
OpenAPI Specification.

#### Generate the OpenAPI Specification for Artemis

1) start a DB instance for Artemis
2) make sure a start-able instance of Artemis is configured in your `application-local.yml` as the local profile is loaded
   to generate the OpenAPI specification (so far we use an Artemis instance without any external system for the
   generation procedure)
3) run the following gradle command:
   ```
   gradle clean generateOpenApiDocs
   ```

Output is a file called `openapi.json` which is a representation of the OpenAPI specification of Artemis.

### Generate, Correct/Modify and Build Artemis Client SDK Code

1) copy the generated `openapi.json` OpenAPI specification to the root of the Artemis Client SDK project
2) generate the client code running:
   ```
   docker run --rm --user 1000:1000 \                                          
   -v ${PWD}:/local openapitools/openapi-generator-cli:latest-release generate \
   -i /local/openapi.json \
   -g java \
   -o /local \
   -c /local/openapi-generator-config.yaml
   ```

3) Cherry-pick commits after a newly generated SDK code got committed.

   Check for a commit message in artemis-sdk which has this pattern: `new generated sdk from COMMIT HASH FROM ARTEMIS`.

   Then cherry-pick everything afterward which is applied to the artemis-sdk folder!

   We first tried patches but that didn't work out as we couldn't resolve conflicts nicely that way.

   (TODO: Think about using mustache templates, but not sure how to update them? Maybe a different approach then
   cherry-picking works?!)

4) Build Artemis Client SDK which outputs a JAR file:
   ```
   ./gradlew clean build
   ```

### Insert updated SDK as Dependency

Replace the JAR file `artemis-client-sdk-v0.jar` in the Zeus project in the directory `libs` with the updated JAR file
from the previous step.
