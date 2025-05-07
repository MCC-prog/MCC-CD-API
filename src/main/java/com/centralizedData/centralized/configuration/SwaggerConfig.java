package com.centralizedData.centralized.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
			return new OpenAPI().info(new Info().title("Centralaized App"))
					.addServersItem(new Server().url("https://erp.mccblr.edu.in/centralized/").description("Test-Prod"))
					.addServersItem(new Server().url("http://localhost:8080").description("Localhost"))
					.addSecurityItem(new SecurityRequirement().addList("jwtToken"))
					.components(new Components().addSecuritySchemes("jwtToken",
							new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
									.in(SecurityScheme.In.HEADER).name("Authorisation")));
	 
		}
	 
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**").allowedOrigins("https://erp.mccblr.edu.in/centralized/") // Adjust based on Swagger URL
							.allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
				}
			};
		}

	
	


}
