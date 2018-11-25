package org.vic.nw.tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.vic.nw.tracker.repository.JsonDao;

@Configuration
@ComponentScan(basePackages = {"org.vic.nw.tracker"})
public class NwtConfiguration {

    @Bean
    public JsonDao jsonDao(){
        return new JsonDao();
    }
}
