package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Resource;

import java.util.List;

/**
 * Created by sarala on 30/09/2016.
 */
public interface ResourceService {

    /*
    * Returns non obsolete resources for a given collection
    */
    List<Resource> findNonObsoleteResources(Collection collection);

    /*
    * Returns a non obsolete resource for the given identifier eg: MIR:00100497
    */
    Resource findNonObsoleteResource(String id);

    /*
    * Find all resources
    */
    List<Resource> findAll();


    Integer countByNonObsolete();
}
