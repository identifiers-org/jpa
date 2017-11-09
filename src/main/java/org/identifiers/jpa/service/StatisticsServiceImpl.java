package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Resource;
import org.identifiers.jpa.domain.Statistics;
import org.springframework.stereotype.Component;

/**
 * Created by sarala on 06/09/2017.
 */
@Component("statisticsService")
public class StatisticsServiceImpl implements StatisticsService {

    private StatisticsRepository statisticsRepository;

    public StatisticsServiceImpl(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    @Override
    public String findKeyword(Resource resource) {
        Statistics statistics = statisticsRepository.findByResource(resource);
        return statistics.getKeyword();
    }
}
