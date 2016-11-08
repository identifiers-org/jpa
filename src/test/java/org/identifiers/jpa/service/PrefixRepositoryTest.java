package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sarala on 06/10/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PrefixRepositoryTest {
    @Autowired
    PrefixRepository prefixRepository;

    @Autowired
    CollectionRepository collectionRepository;

    @Autowired
    PrefixService prefixService;

    @Test
    public void findByCollection() throws Exception {
        Collection collection = collectionRepository.findById("MIR:00000015");
        assertThat(prefixRepository.findByCollection(collection)).hasSize(6);
    }

    @Test
    public void findByCollectionAndDeprecatedAndUriType() throws Exception {
        Collection collection = collectionRepository.findById("MIR:00000015");
        List<Prefix> prefixes = prefixRepository.findByCollectionAndDeprecatedAndUriType(collection,0, PrefixService.URN);
        assertThat(prefixes).hasSize(1);
        assertThat(prefixes.get(0)).hasFieldOrPropertyWithValue("uri",prefixService.getMiriamUrn("pubmed"));
    }

    @Test
    public void findByUriAndDeprecatedAndUriType() throws Exception {
        Prefix prefix = prefixRepository.findByUriAndDeprecatedAndUriType(prefixService.getMiriamUrn("pubmed"),0, PrefixService.URN);
        assertThat(prefix).hasFieldOrPropertyWithValue("uri",prefixService.getMiriamUrn("pubmed"));
    }

    @Test
    public void findByDeprecatedAndUriTypeAndUriContaining() throws Exception{
        assertThat(prefixRepository.findByDeprecatedAndUriTypeAndUriContaining(0,PrefixService.URN,"pubmed").get(0)).hasFieldOrPropertyWithValue("uri","urn:miriam:pubmed");
    }

}