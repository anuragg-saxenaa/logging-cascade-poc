package com.arrayindex.demoparentlogback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages= {"com.arrayindex.*", "com.arrayindex.demochild.*"})
@SpringBootApplication(scanBasePackages= {"com.arrayindex.*"} )
public class DemoParentLogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoParentLogbackApplication.class, args);
    }

}
