package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

/**
 * Created by sarala on 26/09/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectionRepositoryIntegrationTests {

    @Autowired
    CollectionRepository repository;

    @Test
    public void findsFirstPageOfCities() {

        List<Collection> collections = this.repository.findAll();
        assertThat(collections.size());
    }
}
