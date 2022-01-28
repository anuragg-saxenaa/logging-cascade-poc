package com.arrayindex.demochild;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ChildTestController {


    @GetMapping("/child")
    public String getInfo() {

        log.info("testing child logger...");
        return "sucess..x";
    }
}
