package org.identifiers.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by sarala on 03/10/2016.
 */
@Component
public class ConfigProperties {

    @Value("${identifiers.http}")
    private String http;

    public String getHttp() {
        return http;
    }

}
