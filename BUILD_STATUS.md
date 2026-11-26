# Build status

The source changes are prepared, but a compiled JAR is not included. A build was attempted in the preparation environment and could not start because the Gradle 4.0 wrapper distribution could not be downloaded (network/DNS unavailable). This is an environment limitation, not a successful compile.

Build with JDK 8 and network access using `./gradlew build`. Then test in a Minecraft 1.8.9 Forge instance with OneConfig 0.2.2-alpha228 installed.
