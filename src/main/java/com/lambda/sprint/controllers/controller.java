package com.lambda.sprint.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller
{
    @GetMapping("/test")
    public ResponseEntity<?> doTest()
    {
        return new ResponseEntity<>("Its All Good", HttpStatus.OK);
    }
}
