Compile GraalVM Image (Packaging)
=================================

setup local GraalVM (for example unpack it at /opt/graalvm-ce-java17-22.3.1) and export it's path before running gradle:
export JAVA_HOME=/opt/graalvm-ce-java17-22.3.1      
export PATH=/opt/graalvm-ce-java17-22.3.1/bin:$PATH

./gradlew nativeCompile to build the executable

if you just want to run the program for development purposes use:
./gradlew run --args="--help"
