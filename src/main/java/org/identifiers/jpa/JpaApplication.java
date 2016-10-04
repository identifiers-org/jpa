package org.identifiers.jpa;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.identifiers.jpa.domain.Resource;
import org.identifiers.jpa.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


/**
 * Created by sarala on 26/09/2016.
 */

@SpringBootApplication
public class JpaApplication {

    private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CollectionRepository collectionRepository, ResourceRepository resourceRepository,
                                  PrefixRepository prefixRepository, ConfigProperties configProperties){
        return (args) -> {

            PrefixService prefixService = new PrefixServiceImpl(prefixRepository);

            Prefix prefix =prefixService.findPrefix("pubmed");
            log.info("prefix: "+ prefix.getCollection().getName());

            CollectionService collectionService = new CollectionServiceImpl(collectionRepository);

/*            for(Collection collection : collectionService.findCollections("rea")){

               // log.info(collection.getName() +" " + collection.getId());
               // log.info(collection.getName() + " resources number: " + resourceRepository.findByCollection(collection).size());
                log.info(collection.getName() + " : " + prefixService.findIdentifiersUrl(prefixService.findPrefixString(collection),configProperties));
            }*/




        };

    }
}
