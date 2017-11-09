package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Resource;
import org.identifiers.jpa.domain.Statistics;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sarala on 06/09/2017.
 */
public interface StatisticsRepository extends CrudRepository<Statistics, Long> {

    Statistics findByResource(Resource resource);
}
