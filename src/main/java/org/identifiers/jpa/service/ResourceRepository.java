package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Resource;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sarala on 27/09/2016.
 */
public interface ResourceRepository extends CrudRepository<Resource, Long> {

    List<Resource> findAll();

    List<Resource> findByCollection(Collection collection);

    List<Resource> findByCollectionAndObsolete(Collection collection, int obsolete);

    Resource findByIdAndObsolete(String id, int obsolete);

}
