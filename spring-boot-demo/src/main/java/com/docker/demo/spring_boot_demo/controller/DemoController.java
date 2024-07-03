package com.docker.demo.spring_boot_demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "")
    public ResponseEntity<Object> info() {
        try {
            return new ResponseEntity<>("UUID: " + UUID.randomUUID().toString() + " from replica: " + InetAddress.getLocalHost().getHostName(), HttpStatus.OK);
        } catch (UnknownHostException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
