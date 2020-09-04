package com.extensionsample.extensionsample.controller;

import com.extensionsample.extensionsample.extensions.StringExtensions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.experimental.ExtensionMethod;

@RestController
@ExtensionMethod({
    StringExtensions.class
})
public class HelloController { 


    @GetMapping
    public String hello(){
        return "hello".addMyName();
    }


    
}