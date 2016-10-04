package org.identifiers.jpa.service;

import org.identifiers.jpa.ConfigProperties;
import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;

import java.util.List;

/**
 * Created by sarala on 28/09/2016.
 */
public interface PrefixService {

    Prefix findPrefix(Collection collection);

    String findPrefixString(Collection collection);

    String findIdentifiersUrl(String collection, ConfigProperties configProperties);

    Prefix findPrefix(String prefix);
}
