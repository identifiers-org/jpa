package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

/**
 * Created by sarala on 26/09/2016.
 */
public interface CollectionRepository extends CrudRepository<Collection, Long> {

    Set<Collection> findAll();

    Set<Collection> findByObsolete(int value);

    Collection findById(String id);

    /*
    * Returns a nonobsolete list of Collections that matches the given name eg: pubmed
    */
    @Query("Select c from Collection c where c.obsolete = :obsolete and c.name like %:name%")
    Set<Collection> findByObsoleteAndNameContaining(@Param("obsolete") int obsolete, @Param("name") String name);

    @Query("Select c from Collection c join fetch c.prefixes p " +
            "where c.obsolete = :obsolete and p.deprecated = :deprecated and p.uriType = :uriType and " +
            "c.name like %:name% or p.uri like %:name%")
    Set<Collection> findByNameAndPrefixContaining(@Param("obsolete") int obsolete, @Param("name") String name, @Param("deprecated") int deprecated, @Param("uriType") String uriType);

    /*
    SELECT DISTINCT c.name FROM mir_datatype c
    JOIN mir_uri p ON c.datatype_id = p.ptr_datatype JOIN mir_resource r ON c.datatype_id = r.ptr_datatype
    WHERE c.obsolete = 0 and p.deprecated = 0 and p.uri_type = "URN" and c.name like "%Europe PMC%" or p.uri like "%Europe PMC%" or r.info like "%Europe PMC%"
    * */

    @Query("Select c from Collection c join fetch c.prefixes p join fetch c.resources r " +
            "where c.obsolete = :obsolete and p.deprecated = :deprecated and p.uriType = :uriType and " +
            "c.name like %:name% or p.uri like %:name% or r.info like %:name%")
    Set<Collection> findByNameAndPrefixAndResourceContaining(@Param("obsolete") int obsolete, @Param("name") String name, @Param("deprecated") int deprecated, @Param("uriType") String uriType);

    Integer countByObsolete(int value);

    Collection findFirstByObsoleteOrderByModifiedDesc(int value);
}
