package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sarala on 26/09/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class CollectionRepositoryTests {

    @Autowired
    CollectionRepository repository;

    @Test
    public void findAll() throws Exception{
        Set<Collection> collections = repository.findAll();
        assertThat(collections).hasSize(5);
    }

    @Test
    public void findByObsolete()  throws Exception{
        assertThat(repository.findByObsolete(1)).hasSize(1);
    }

    @Test
    public void findById() throws Exception{
        assertThat(repository.findById("MIR:00000005")).hasFieldOrPropertyWithValue("name", "UniProt Knowledgebase");
    }

    /*
    * Note - this needs to be case insensitive, works for mysql but does not work for h2
    * */
    @Test
    public void findByObsoleteAndNameContaining() throws Exception{
        assertThat(repository.findByObsoleteAndNameContaining(0,"Pub").iterator().next()).hasFieldOrPropertyWithValue("name","PubMed");
    }

    @Test
    public void findByNameAndPrefixContaining()  throws Exception{
        assertThat(repository.findByNameAndPrefixContaining(0,"pubmed",0,"URN").iterator().next()).hasFieldOrPropertyWithValue("name","PubMed");
    }

    @Test
    public void findByNameAndPrefixAndResourceContaining()  throws Exception{
        assertThat(repository.findByNameAndPrefixAndResourceContaining(0,"Europe PMC",0,"URN").iterator().next()).hasFieldOrPropertyWithValue("name","PubMed");
    }

}
