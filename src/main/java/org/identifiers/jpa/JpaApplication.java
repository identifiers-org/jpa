package org.identifiers.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by sarala on 26/09/2016.
 */

@SpringBootApplication
public class JpaApplication {

    private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JpaApplication.class, args);
    }
}
