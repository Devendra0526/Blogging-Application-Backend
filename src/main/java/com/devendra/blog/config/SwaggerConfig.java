package com.devendra.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {

	/**
	 * 
	 **/

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.components(new Components()
						.addSecuritySchemes("basicScheme",
								new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic"))
						.addParameters("myHeader1", new Parameter().in("header").schema(new Schema()).name("myHeader1"))
						.addHeaders("myHeader2", new Header().description("myHeader2 header").schema(new Schema())))
				.info(new Info().title("Blogging Application : By Devendra")
						.description("Blogging Application : Backend").version("v2.4.0")
						.license(new License().name("Migrating from SpringFox to Springdoc OpenAPI")
								.url("https://springdoc.org/migrating-from-springfox.html")))
				.externalDocs(new ExternalDocumentation().description("Swagger APIs Documentation")
						.url("http://localhost:8080/swagger-ui/index.html"));
	}

	/**
	 * 
	 * @Bean public Docket api() { return new
	 *       Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any())
	 *       .paths(PathSelectors.any()).build();
	 * 
	 *       }
	 * 
	 *       private ApiInfo apiInfo() {
	 * 
	 *       // TODO Auto-generated method stub
	 * 
	 *       return new ApiInfo("Blogging Application : Backend", "This is developed
	 *       by Devendra Yadav", "3.0", "Terms os service", new Contact("Devendra",
	 *       "http://localhost:8080/api/v1/auth/login",
	 *       "yadavdevendra0526@gmail.com"), "License of APIs", "APIs license URLs",
	 *       Collections.emptyList()); }
	 *
	 * 
	 **/

}
