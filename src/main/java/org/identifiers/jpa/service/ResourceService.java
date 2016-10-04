package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Collection;
import org.identifiers.jpa.domain.Resource;

import java.util.List;

/**
 * Created by sarala on 30/09/2016.
 */
public interface ResourceService {

    List<Resource> findNonObsoleteResources(Collection collection);

    Resource findNonObsoleteResource(String id);
}
