package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Resource;
import org.junit.Before;
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
public class ResourceServiceTest {

    @Autowired
    ResourceService resourceService;

    @Autowired
    CollectionService collectionService;

    private Collection collection;

    @Before
    public void setUp() throws Exception {
        /* Instanciation of pubmed collection */
        collection = collectionService.findById("MIR:00000015");
    }

    @Test
    public void findNonObsoleteResources() throws Exception {
        assertThat(resourceService.findNonObsoleteResources(collection)).hasSize(5);
    }

    @Test
    public void findNonObsoleteResource() throws Exception {
        Resource resource = resourceService.findNonObsoleteResource("MIR:00100497");
        assertThat(resource).hasFieldOrPropertyWithValue("info","Europe PMC");
    }

}