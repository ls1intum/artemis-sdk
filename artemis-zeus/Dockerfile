#-----------------------------------------------------------------------------------------------------------------------
# Zeus Dockerfile
#-----------------------------------------------------------------------------------------------------------------------

#-----------------------------------------------------------------------------------------------------------------------
# build stage
#-----------------------------------------------------------------------------------------------------------------------
FROM docker.io/library/eclipse-temurin:17-jdk as builder

WORKDIR /code
# so far just using the .dockerignore to define what isn't necessary here
COPY . .

RUN ./gradlew -i --stacktrace --no-daemon clean shadowJar

#-----------------------------------------------------------------------------------------------------------------------
# runtime stage
#-----------------------------------------------------------------------------------------------------------------------
FROM docker.io/library/eclipse-temurin:17-jre as runtime

WORKDIR /zeus

# Create zeus user and set right owners
RUN \
  useradd -Ums /bin/bash zeus \
  && chown -R zeus:zeus /zeus
USER zeus:zeus

# Copy jar to execution location
COPY --chown=zeus:zeus --from=builder /code/build/libs/zeus*-all.jar ./zeus.jar

ENTRYPOINT [ "java", \
"-jar", "/zeus/zeus.jar" ]
