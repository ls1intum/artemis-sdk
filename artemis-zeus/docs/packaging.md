# Compile GraalVM Image (Packaging)

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
