call mvn clean archetype:create-from-project -Darchetype.properties=archetype.properties
cd target\generated-sources\archetype
call mvn install
cd ..\..\..