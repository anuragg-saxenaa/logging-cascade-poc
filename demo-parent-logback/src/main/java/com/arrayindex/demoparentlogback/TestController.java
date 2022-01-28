package com.arrayindex.demoparentlogback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    LogBackTestService logBackTestService;


    @GetMapping("/hi")
    public String getInfo() {

        return logBackTestService.getInfo();

    }
}
