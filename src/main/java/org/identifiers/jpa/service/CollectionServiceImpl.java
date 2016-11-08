package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by sarala on 26/09/2016.
 */

@Component("collectionService")
public class CollectionServiceImpl implements CollectionService{

    private final CollectionRepository collectionRepository;

    public CollectionServiceImpl(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @Override
    public Set<Collection> findNonObsolete() {
        return collectionRepository.findByObsolete(0);
    }

    @Override
    public Collection findById(String id) {
        return collectionRepository.findById(id);
    }

    @Override
    public Set<Collection> findCollections(String name){
        return collectionRepository.findByObsoleteAndNameContaining(0,name);
    }

    @Override
    public Set<Collection> findByNameAndPrefixContaining(String name){
        return collectionRepository.findByNameAndPrefixContaining(0, name, 0, PrefixService.URN);

    }


}
