package org.vic.nw.tracker;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.vic.nw.tracker.repository.JsonDao;

import java.util.TimeZone;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"org.vic.nw.tracker"})
public class NwtConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().setTimeZone(TimeZone.getDefault()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
