package es.pedrogalan.time.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="time-service")
public class TimeServiceConfiguration {

    private String timeformat;

    public String getTimeformat() {
        return timeformat;
    }

    public void setTimeformat(String timeformat) {
        this.timeformat = timeformat;
    }
}