Steps 
- Go to maven repository
- search spring core and spring context
- Add the dependency in the pom.xml file

History
- before maven existed jar files for all the dependencies haad to be
  added manually but with the inception of maven, process got smoother

Creating a Bean 
- go to https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
- copy bean xml and create a new xml file in resources and paste it.
- create a bean with id and class. This id will be used to create the object of our class which will be a bean.

Bean Definition
- objects created by spring application are known as beans
- Bean configuration can be provide in many ways like xml, annotations

Lifecycle of Bean
- instanctiation ---> population of attributes ----> initialization(dependency injection) ---> ready for use


Autowiring
- handling of beans without configuring in any xml file
- 3 types: by name, by constructor, by type
- for byName autowiring we don't need constructor, we just need setter.