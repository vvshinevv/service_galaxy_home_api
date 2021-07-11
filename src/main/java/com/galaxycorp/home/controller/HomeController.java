package com.galaxycorp.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("sample", "sample");
        return hashMap;
    }
}
