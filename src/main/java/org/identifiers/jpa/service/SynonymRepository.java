package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Synonym;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by sarala on 31/01/2017.
 */
public interface SynonymRepository extends CrudRepository<Synonym, Long> {

    Set<Synonym> findByCollection(Collection collection);
}
