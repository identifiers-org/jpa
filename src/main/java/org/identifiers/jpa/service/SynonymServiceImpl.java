package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Synonym;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by sarala on 31/01/2017.
 */

@Component("synonymService")
public class SynonymServiceImpl implements SynonymService{

    private SynonymRepository synonymRepository;

    public SynonymServiceImpl(SynonymRepository synonymRepository) {
        this.synonymRepository = synonymRepository;
    }

    @Override
    public Set<Synonym> findSynonyms(Collection collection) {
        return synonymRepository.findByCollection(collection);
    }
}
