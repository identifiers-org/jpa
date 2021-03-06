package org.identifiers.jpa.service;

import org.identifiers.jpa.ConfigProperties;
import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Prefix;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sarala on 28/09/2016.
 */
@Component("prefixService")
public class PrefixServiceImpl implements PrefixService{

    private PrefixRepository prefixRepository;

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
        Prefix prefix = findPrefix(collection);
        return prefix!=null ? prefix.getUri().substring(11) : null;
    }

    @Override
    public String findIdentifiersUrl(String prefix, ConfigProperties configProperties){
        return configProperties.getHttp()+prefix;
    }

    @Override
    public Prefix findPrefix(String prefix){
        return prefixRepository.findByUriAndDeprecatedAndUriType(getMiriamUrn(prefix),0,URN);
    }

    @Override
    public String getMiriamUrn(String prefix) {
        return MIRIAM_URN+prefix;
    }

    @Override
    public List<Prefix> findByUriContaining(String prefix) {
        return prefixRepository.findByDeprecatedAndUriTypeAndUriContaining (0, URN, getMiriamUrn(prefix));
    }
}
