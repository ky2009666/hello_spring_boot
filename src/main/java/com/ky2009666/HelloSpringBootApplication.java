package com.ky2009666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ky2009666
 */
@SpringBootApplication
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication application =
                new SpringApplication(HelloSpringBootApplication.class);
        application.run(args);
        //SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
