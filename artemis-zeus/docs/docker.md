Docker
======

You can build and run Zeus with Docker.

Build:
docker build . -t ghcr.io/ls1intum/artemis-sdk:latest

Run:
docker run --rm -it ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:8080 show course --id=1
