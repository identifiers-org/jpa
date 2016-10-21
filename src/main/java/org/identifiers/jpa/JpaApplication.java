package org.identifiers.jpa;

import org.identifiers.jpa.service.CollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


/**
 * Created by sarala on 26/09/2016.
 */

@SpringBootApplication
public class JpaApplication {

    private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);

    public static void main(String[] args) throws Exception {
        String datacenter = System.getenv("DATACENTRE");
        if(datacenter!=null){
            System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, datacenter);
        }
        SpringApplication.run(JpaApplication.class, args);
    }

/*    @Bean
    public CommandLineRunner demo(ConfigProperties properties, CollectionService collectionService) {
        return (args) -> {
            System.out.println(properties.getHttp());
            System.out.println(collectionService.findNonObsolete().size());
        };
    }*/
}
