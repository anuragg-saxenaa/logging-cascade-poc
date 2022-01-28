package com.arrayindex.demoparentlogback;


import com.arrayindex.demochild.Log4JTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogBackTestService {

    @Autowired
    Log4JTestService log4JTestService;

    public String getInfo(){
        log.info("calling LogBackTestService......");
        return log4JTestService.testLog("message passed from Log4J service ....");

    }
}
