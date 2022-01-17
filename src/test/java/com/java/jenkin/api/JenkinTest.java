package com.java.jenkin.api;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JenkinTest {


    public static Logger logger= LoggerFactory.getLogger(JenkinTest.class);


    @Test
    public void contextLoads(){

       logger.info("Test Case Executing");


    }

}
