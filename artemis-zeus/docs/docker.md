# Docker

You can build and run Zeus with Docker.

## Build Docker Image
`docker build . -t ghcr.io/ls1intum/artemis-sdk:latest`

## Docker Networking
In the following documentation `host.docker.internal` and the port `54321` is used to connect to Artemis as a workaround.

`host.docker.internal` points at your localhost and the port `54321` is used as it provides access to Artemis without
TLS as the artemis self-signed development certificate doesn't include `host.docker.internal` as hostname yet.

## Start Zeus inside a container
Before you have to build the Docker Image as shown above.

Then start Zeus using this command: <br>
`docker run --rm -it ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 COMMAND`

Another example showing all available commands as you can see you can omit zeus and start with its arguments:
`docker run --rm -it ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 --help`

On Linux append the host `host.docker.internal`: <br>
`docker run --rm -it --add-host=host.docker.internal:host-gateway ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 COMMAND`
