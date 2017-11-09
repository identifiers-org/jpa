package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;

import java.util.List;
import java.util.Set;

/**
 * Created by sarala on 26/09/2016.
 */
public interface CollectionService {

    /*
    * Returns all nonobsolete collections ie.(obsolete flag set to '0')
    */
    Set<Collection> findNonObsolete();

    /*
    * Returns a Collection by identifier eg. MIR:00000005
    */
    Collection findById(String id);

    /*
    * Returns a nonobsolete list of Collections that matches the given name eg: pubmed
    */
    Set<Collection> findCollections(String name);


    /*
    * Returns a list of collections that matches the given name or prefix
    */
    Set<Collection> findByNameAndPrefixContaining(String name);

    /*
    * Returns a list of collections that matches the given name or prefix or resource name
    */
    Set<Collection> findByNameAndPrefixAndResourceContaining(String name);

    Integer countByNonObsolete();

    Collection findLastModifiedDate();

}
