package org.identifiers.jpa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Created by sarala on 07/10/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class CollectionServiceTest {

    @Autowired
    CollectionService collectionService;

    @Test
    public void findNonObsolete() throws Exception{
        assertThat(collectionService.findNonObsolete()).hasSize(4);
    }

    @Test
    public void findById() throws Exception {

    }

    /*
    * Find non obsolete collections that has name starting with "pub"
    * Note - this needs to be case insensitive, works for mysql but does not work for h2
    */
    @Test
    public void findCollections() throws Exception {
        assertThat(collectionService.findCollections("Pub").get(0)).hasFieldOrPropertyWithValue("name","PubMed");
    }

}