package org.identifiers.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by sarala on 03/10/2016.
 */
@Component
public class ConfigProperties {

    private String http;

    @Autowired
    public ConfigProperties(@Value("${identifiers.http}") String http) {
        this.http = http;
    }

    public String getHttp() {
        return http;
    }

}
