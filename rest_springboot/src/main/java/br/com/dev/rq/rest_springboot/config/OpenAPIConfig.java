package br.com.dev.rq.rest_springboot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Startup")
                        .version("v1")
                        .description("API Startup")
                        .termsOfService("https://dev.rodrigo.com.br/startup")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://dev.rodrigo.com.br/startup")));
    }

}
