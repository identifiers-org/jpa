package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sarala on 27/09/2016.
 */
public interface PrefixRepository extends CrudRepository<Prefix, Long> {

    List<Prefix> findByCollection(Collection collection);

    List<Prefix> findByCollectionAndDeprecatedAndUriType(Collection collection, int deprecated, String uriType);

    Prefix findByUriAndDeprecatedAndUriType(String uri, int deprecate, String uriType);
}
