package com.ahmetbozkurt.microservices.limitsservice.controller;

import com.ahmetbozkurt.microservices.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(1,1000);
    }
}
