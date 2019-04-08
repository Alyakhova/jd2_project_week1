package com.gmail.anastasiya.lyakhova;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class HelloWorldRepository
{

    static void getHelloWorldSring() {
        Logger logger = LogManager.getLogger(HelloWorldRepository.class);
        logger.debug("This is repository");
        //System.out.println("This is repository");
    }

   // public static void main(String[] args) {
     //   getHelloWorldSring();
    //}
}
