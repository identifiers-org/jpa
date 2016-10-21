package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Resource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sarala on 30/09/2016.
 */
@Component("resourceService")
public class ResourceServiceImpl implements ResourceService {

    private ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public List<Resource> findNonObsoleteResources(Collection collection) {
        return resourceRepository.findByCollectionAndObsolete(collection,0);
    }

    @Override
    public Resource findNonObsoleteResource(String id) {
        return resourceRepository.findByIdAndObsolete(id,0);
    }
}
