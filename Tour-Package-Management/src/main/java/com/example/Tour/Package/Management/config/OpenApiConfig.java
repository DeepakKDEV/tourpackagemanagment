package com.example.Tour.Package.Management.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Tour Package Management API")
                        .description("API documentation for managing tour packages with search, create, and AWS S3 integration")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Deepak Kumar Singh")
                                .email("deepak76311@gmail.com")
                                .url("https://github.com/DeepakKDEV")));
    }
}

