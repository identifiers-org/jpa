package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sarala on 26/09/2016.
 */

@Component("collectionService")
@Transactional
public class CollectionServiceImpl implements CollectionService{

    private final CollectionRepository collectionRepository;

    public CollectionServiceImpl(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @Override
    public List<Collection> findNonObsolete() {
        return collectionRepository.findByObsolete(0);
    }

    @Override
    public Collection findById(String id) {
        return collectionRepository.findById(id);
    }

    public List<Collection> findCollections(String name){
        return collectionRepository.findByObsoleteAndNameContaining(0,name);
    }

}
