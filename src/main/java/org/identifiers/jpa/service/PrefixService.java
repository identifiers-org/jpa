package org.identifiers.jpa.service;

import org.identifiers.jpa.ConfigProperties;
import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sarala on 28/09/2016.
 */
public interface PrefixService {

    String URN = "URN";

    String MIRIAM_URN = "urn:miriam:";

    /*
    * Returns the mapped prefix object given a collection
    */
    Prefix findPrefix(Collection collection);

    /*
    * Returns the mapped prefix string given a collection.
    * Prefix is stored as a urn eg: urn:miriam:pubmed.
    * This method removes miriam urn and returns pubmed
    */
    String findPrefixString(Collection collection);

    /*
    * Returns identifiers.org url to a given collection prefix.
    * eg https://identifiers.org/pubmed
    */
    String findIdentifiersUrl(String prefix, ConfigProperties configProperties);

    /*
    * Returns Prefix for a given prefix string. eg: pubmed
    */
    Prefix findPrefix(String prefix);

    /*
    * Returns miriam urn for a given prefix string eg: urn:miriam:pubmed
    */
    String getMiriamUrn(String prefix);

    List<Prefix> findByUriContaining(String prefix);

}
