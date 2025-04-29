package com.centralizedData.centralized.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {
	
	
	@Bean
	public OpenAPI custumConfig() {
		return new OpenAPI()
				.info(
				new Info().title("Centralaized App")
						  .description("CND"))
//				.addServersItem(new Server().url("http://localhost:8080")) // Ensures base URL is set correctly
				.addSecurityItem(new SecurityRequirement().addList("jwtToken"))
				.components(new Components()
						.addSecuritySchemes("jwtToken", new SecurityScheme()
						.type(SecurityScheme.Type.HTTP)
						.scheme("bearer")
						.bearerFormat("JWT")
						.in(SecurityScheme.In.HEADER)
						.name("Authorisation")
						)) ;
		
	}

}
