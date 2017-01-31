package org.identifiers.jpa;

import org.identifiers.jpa.service.CollectionRepository;
import org.identifiers.jpa.service.CollectionService;
import org.identifiers.jpa.service.SynonymRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;


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
        }else{
            System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "hx");
        }
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ConfigProperties properties, CollectionRepository collectionRepository, SynonymRepository synonymRepository) {
        return (args) -> {
            System.out.println(synonymRepository.findByCollection(collectionRepository.findById("MIR:00000006")).size());
            System.out.println(collectionRepository.findByNameAndPrefixContaining(0,"pubmed",0,"URN").size());
        };
    }
}
