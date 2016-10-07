package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sarala on 26/09/2016.
 */
public interface CollectionRepository extends CrudRepository<Collection, Long> {

    List<Collection> findAll();

    List<Collection> findByObsolete(int value);

    Collection findById(String id);

    /*
    * Returns a nonobsolete list of Collections that matches the given name eg: pubmed
    */
    @Query("Select c from Collection c where c.obsolete = :obsolete and c.name like %:name%")
    List<Collection> findByObsoleteAndNameContaining(@Param("obsolete") int obsolete, @Param("name") String name);

}
