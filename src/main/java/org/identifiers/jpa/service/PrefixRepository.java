package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sarala on 27/09/2016.
 */
public interface PrefixRepository extends CrudRepository<Prefix, Long> {

    List<Prefix> findByCollection(Collection collection);

    List<Prefix> findByCollectionAndDeprecatedAndUriType(Collection collection, int deprecated, String uriType);

    Prefix findByUriAndDeprecatedAndUriType(String uri, int deprecate, String uriType);

    /*
    * Returns a nonobsolete list of Prefixes that matches the given prefix eg: pubmed
    */
    @Query("Select p from Prefix p where p.deprecated = :deprecated and p.uriType = :uriType and p.uri like %:uri%")
    List<Prefix> findByDeprecatedAndUriTypeAndUriContaining(@Param("deprecated") int deprecated, @Param("uriType") String uriType, @Param("uri") String uri);
}
