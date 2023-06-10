1) generate OpenAPI spec inside the artemis project and use it for the code generation (copy the file openapi.json to the root of this project)
2) generate the client code:
   docker run --rm --user 1000:1000 \                                          
   -v ${PWD}:/local openapitools/openapi-generator-cli:latest-release generate \
   -i /local/openapi.json \
   -g java \
   -o /local \
   -c /local/openapi-generator-config.yaml

3) Cherry pick commits after a newly generated code got committed. First tried patches but that didn't work out as I
couldn't resolve conflicts nicely that way.
(TODO: think about using mustache template but not sure how to update them? Maybe a different approach then
cherry picking works?!)

Check for a commit message in artemis-sdk which has this pattern: new generated sdk from COMMIT HASH FROM ARTEMIS
Then cherry-pick everything afterwards which is applied to the artemis-sdk folder!

4) build: 
./gradlew clean build
