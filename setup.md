1) generate OpenAPI spec inside the artemis project and use it for the code generation (use the openapi.fixed.json with manual fixes)
// TODO: fix the spring boot code so that the right spec file gets generated
2) generate the client code:
   docker run --rm \                                          
   -v ${PWD}:/local openapitools/openapi-generator-cli generate \
   -i /local/openapi.fixed.json \
   -g java \
   -o /local --artifact-id artemis-sdk --library jersey3 --api-package de.tum.cit.ase
