package com.sonia.org.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
    @RequestMapping(value = {"/","/WeavesApplication "})
    public ResponseEntity<String> home()
    {
        return new ResponseEntity<>("welcome to weaves hair shop ", HttpStatus.OK);
    }
}
