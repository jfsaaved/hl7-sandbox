package io.accenture.components.cart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/test")
public class RestTemplateController {

    private RestTemplate restTemplate;

    public RestTemplateController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("{id}")
    public ResponseEntity<String> find(@PathVariable long id) throws Exception{
        URI uri = new URI("http://localhost:8081/items/1");
        return restTemplate.getForEntity(uri, String.class);
    }

}
