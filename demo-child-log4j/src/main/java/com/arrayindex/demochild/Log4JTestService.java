package com.arrayindex.demochild;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Log4JTestService {

    public String testLog(String param){
       log.info("received message from caller ... "+param);
        return "send message from log4j service....";
    }
}
