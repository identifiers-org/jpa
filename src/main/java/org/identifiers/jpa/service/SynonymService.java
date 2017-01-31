package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Synonym;

import java.util.Set;

/**
 * Created by sarala on 31/01/2017.
 */
public interface SynonymService {

    Set<Synonym> findSynonyms(Collection collection);
}
