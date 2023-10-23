package br.com.dev.rq.rest_springboot.config;

import org.springframework.beans.factory.annotation.Value;

public class DatasourceConfig {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

}
