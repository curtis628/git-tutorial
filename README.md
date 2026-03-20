# git-tutorial
Interactive git tutorial

Setup
-----
1. Create bare-bones Java project via `mvn:archetype`
```bash
mvn archetype:generate \
  -DgroupId=net.tcurt.tutorials.git \
  -DartifactId=git-tutorial \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.4 \
  -DinteractiveMode=false
```
