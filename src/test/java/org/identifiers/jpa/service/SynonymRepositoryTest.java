package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Synonym;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sarala on 31/01/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class SynonymRepositoryTest {

    @Autowired
    SynonymRepository synonymRepository;

    @Autowired
    CollectionRepository collectionRepository;

    /* Find synonyms for taxonomy (MIR:00000006) */
    @Test
    public void findByCollection() throws Exception {
        Collection collection = collectionRepository.findById("MIR:00000006");
        Set<Synonym> synonyms = synonymRepository.findByCollection(collection);
        assertThat(synonyms).hasSize(2);
    }
}
