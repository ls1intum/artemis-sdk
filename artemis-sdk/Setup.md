1) generate OpenAPI spec inside the artemis project and use it for the code generation (use the openapi.fixed.json with manual fixes)
// TODO: fix the spring boot code so that the right spec file gets generated
2) generate the client code:
   docker run --rm --user 1000:1000 \                                          
   -v ${PWD}:/local openapitools/openapi-generator-cli generate \
   -i /local/openapi.fixed.json \
   -g java \
   -o /local \
   -c /local/openapi-generator-config.yaml

3) manually check the following files for changes (TODO: think about using mustache template but not sure how to update them?)
* pom.xml: jakarta.annotation no scope provided necessary
* ApiClient.java: MediaType JSON for MultiPart document
* ApiClient.java: allow selfsigned certificates in customizeClientBuilder
* model/ModelingPlagiarismResult.java: PlagiarismComparisonObject instead of PlagiarismComparisonModelingSubmissionElement otherwise Error during Compilation
* model/Submisson.java: Participation instead of CleanupBuildPlan200Response and durationInMinutes not private otherwise Error during Compilation
