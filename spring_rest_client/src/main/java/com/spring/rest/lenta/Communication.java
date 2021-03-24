package com.spring.rest.lenta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Communication {

    private final String URL = "https://lenta.com/product/529122-rossiya-529122/";

    @Autowired
    private RestTemplate restTemplate;

    public String getPage(){
        ResponseEntity<String> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        });

        String response = responseEntity.getBody();
        return response;
    }

}
