package br.com.dev.rq.rest_springboot.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

public class HttpMessageConverter extends AbstractJackson2HttpMessageConverter {

    public HttpMessageConverter() {
        super(new YAMLMapper().setSerializationInclusion(
                JsonInclude.Include.NON_NULL),
                MediaType.parseMediaType("application/x-yaml")
        );
    }

}
