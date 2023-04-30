# spring-rest-api-documentation-openapi

For the integration between spring-boot 3.0.x and swagger-ui, add the library to the list of your project dependencies (No additional configuration is needed)

1. Add the dependency - springdoc-openapi-starter-webmvc-ui
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.1.0</version>
		</dependency>
      
      
2. Add the below in application properties
    # /api-docs endpoint custom path
    springdoc.api-docs.path=/api-docs

3. Access the documents
http://localhost:8080/swagger-ui/index.html


![image](https://user-images.githubusercontent.com/30445249/235377676-383b45e3-de84-4e26-ac53-0891576927cb.png)
