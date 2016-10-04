package org.identifiers.jpa.service;

import org.identifiers.jpa.ConfigProperties;
import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sarala on 28/09/2016.
 */
@Component("prefixService")
@Transactional
public class PrefixServiceImpl implements PrefixService{

    private PrefixRepository prefixRepository;
    private static String URN = "URN";
    private static String MIRIAM_URN = "urn:miriam:";

    public PrefixServiceImpl(PrefixRepository prefixRepository) {
        this.prefixRepository = prefixRepository;
    }

    @Override
    public Prefix findPrefix(Collection collection) {
        List<Prefix> prefixList = prefixRepository.findByCollectionAndDeprecatedAndUriType(collection,0,URN);
        return prefixList!=null && !prefixList.isEmpty() ? prefixList.get(0) : null;
    }

    @Override
    public String findPrefixString(Collection collection){
        return findPrefix(collection).getUri().substring(11);
    }

    public String findIdentifiersUrl(String collection, ConfigProperties configProperties){
        return configProperties.getHttp()+collection;
    }

    public Prefix findPrefix(String prefix){
        return prefixRepository.findByUriAndDeprecatedAndUriType(MIRIAM_URN+prefix,0,URN);
    }
}
