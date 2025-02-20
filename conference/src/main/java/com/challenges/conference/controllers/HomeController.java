package com.challenges.conference.controllers;

import com.challenges.conference.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    public HomeController(SessionRepository sessionRepository){

    }
    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public Map<String,String> getStatus(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("app-version", appVersion);
        return map;
    }


}
