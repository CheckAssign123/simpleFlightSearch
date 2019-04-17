package com.example.demo.swageer;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {

	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
	      .build()
	      .pathMapping("/")
	      .apiInfo(apiInfo());
	}
	 

	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder().title("light Status")
	    		.description( "Retrieves Data based on Flight number & Departure Date or Origin, Destination & Departure Date")
	    		.termsOfServiceUrl("localhost:8989")
	    		.version("V1").build();
	}
	
}
