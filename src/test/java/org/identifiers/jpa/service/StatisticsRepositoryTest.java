package org.identifiers.jpa.service;

import org.identifiers.jpa.domain.Resource;
import org.identifiers.jpa.domain.Statistics;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sarala on 06/09/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class StatisticsRepositoryTest {

    @Autowired
    StatisticsRepository statisticsRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    StatisticsService statisticsService;

    /* */
    @Test
    public void findByResource() throws Exception {
        Resource resource = resourceRepository.findByIdAndObsolete("MIR:00100023",0);
        Statistics statistics = statisticsRepository.findByResource(resource);
        assertThat(statistics).hasFieldOrPropertyWithValue("keyword",statisticsService.findKeyword(resource));
    }
}