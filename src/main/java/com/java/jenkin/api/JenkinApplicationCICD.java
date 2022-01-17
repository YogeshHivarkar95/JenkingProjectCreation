package com.java.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinApplicationCICD {

   public static   Logger logger= LoggerFactory.getLogger(JenkinApplicationCICD.class);

    public static void main(String[] args) {
        SpringApplication.run(JenkinApplicationCICD.class,args);

    }

    @PostConstruct
    public  init(){
        logger.info("Application Running");
        logger.info("Second Task Is Running happily in jenkin Application Running");
    }

}
