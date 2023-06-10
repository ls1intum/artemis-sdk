Docker
======

You can build and run Zeus with Docker.

Build:
docker build . -t ghcr.io/ls1intum/artemis-sdk:latest

Docker Networking TODO:
The host.docker.internal points at your localhost and the port 54321 is without TLS as the artemis self-signed
development certifcate doesn't include host.docker.internal as hostname yet

Run:
docker run --rm -it ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 show course --id=1

for Linux append the host: host.docker.internal
docker run --rm -it --add-host=host.docker.internal:host-gateway ghcr.io/ls1intum/artemis-sdk:latest --url=http://host.docker.internal:54321 COMMAND
