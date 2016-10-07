package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;

import java.util.List;

/**
 * Created by sarala on 26/09/2016.
 */
public interface CollectionService {

    /*
    * Returns all nonobsolete collections ie.(obsolete flag set to '0')
    */
    List<Collection> findNonObsolete();

    /*
    * Returns a Collection by identifier eg. MIR:00000005
    */
    Collection findById(String id);

    /*
    * Returns a nonobsolete list of Collections that matches the given name eg: pubmed
    */
    List<Collection> findCollections(String name);
}
