**Running**

git clone https://github.com/ugurakyay/justmob
cd justmob
mvn clean test

**Multi Platform**

Also it can be run on Chrome or Firefox if requested, you just need to change the platform from the src/main/resources/config.json file or give a JVM parameter to mvn command, for example:

mvn clean test -Dplatform=firefox