package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;

import java.util.List;

/**
 * Created by sarala on 26/09/2016.
 */
public interface CollectionService {
    List<Collection> findNonObsolete();
    Collection findById(String id);

    List<Collection> findCollections(String name);
}
