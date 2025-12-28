package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Visitor Risk Scoring API")
                        .version("1.0")
                        .description("Swagger documentation for Visitor Risk Scoring project"))
                .servers(List.of(new Server().url("http://localhost:9001").description("Local Server")));
    }
}
