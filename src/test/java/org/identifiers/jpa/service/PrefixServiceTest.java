package org.identifiers.jpa.service;

import org.identifiers.jpa.ConfigProperties;
import org.identifiers.jpa.domain.Collection;
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
public class PrefixServiceTest {

    @Autowired
    PrefixService prefixService;

    @Autowired
    CollectionService collectionService;

    @Autowired
    ConfigProperties configProperties;

    private Collection collection;
    private String pubmed;

    @Before
    public void setUp() throws Exception {
        /* Instanciation of pubmed collection */
        collection = collectionService.findById("MIR:00000015");
        pubmed = "pubmed";
    }

    @Test
    public void findPrefix() throws Exception {
        assertThat(prefixService.findPrefix(collection)).hasFieldOrPropertyWithValue("uri",PrefixService.MIRIAM_URN+pubmed);
    }

    @Test
    public void findPrefixString() throws Exception {
        assertThat(prefixService.findPrefixString(collection)).contains(pubmed);
    }

    @Test
    public void findIdentifiersUrl() throws Exception {
        assertThat(prefixService.findIdentifiersUrl(pubmed,configProperties)).contains(configProperties.getHttp()+pubmed);
    }

    @Test
    public void findPrefixGivenString() throws Exception {
        assertThat(prefixService.findPrefix(pubmed)).hasFieldOrPropertyWithValue("uri",PrefixService.MIRIAM_URN+pubmed);
    }

    @Test
    public void getMiriamUrn() throws Exception {
        assertThat(prefixService.getMiriamUrn(pubmed)).contains(PrefixService.MIRIAM_URN+pubmed);
    }

}