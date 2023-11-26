package com.example.controller;

import com.example.services.InsightService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insights")
public class InsightController {

    @Autowired
    InsightService insightService;
    @GetMapping("/all")
    public ResponseEntity getInsight(){
        System.out.println("line 21");
        return new ResponseEntity(insightService.fetchInsights(), HttpStatus.OK);
    }

}
