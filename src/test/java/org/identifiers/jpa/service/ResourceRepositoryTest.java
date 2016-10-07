package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created by sarala on 06/10/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ResourceRepositoryTest {

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    CollectionRepository collectionRepository;

    @Test
    public void findAll() throws Exception {
        List<Resource> resources = resourceRepository.findAll();
        assertThat(resources).hasSize(11);
    }

    /* Find resources for pubmed (MIR:00000015) */
    @Test
    public void findByCollection() throws Exception {
        Collection collection = collectionRepository.findById("MIR:00000015");
        List<Resource> resources = resourceRepository.findByCollection(collection);
        assertThat(resources).hasSize(8);
    }

    /* Find non obsolete resources for pubmed (MIR:00000015) */
    @Test
    public void findByCollectionAndObsolete() throws Exception {
        Collection collection = collectionRepository.findById("MIR:00000015");
        List<Resource> resources = resourceRepository.findByCollectionAndObsolete(collection,0);
        assertThat(resources).hasSize(5);
    }

    @Test
    public void findByIdAndObsolete() throws Exception {
        Resource resource = resourceRepository.findByIdAndObsolete("MIR:00100497",0);
        assertThat(resource).hasFieldOrPropertyWithValue("info","Europe PMC");
    }

}