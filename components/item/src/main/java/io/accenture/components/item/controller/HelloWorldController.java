package io.accenture.components.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class HelloWorldController {

    @GetMapping
    public String init(){
        return "item";
    }

}
