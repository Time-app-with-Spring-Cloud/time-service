package es.pedrogalan.time.service.config;

import es.pedrogalan.time.service.health.CurrentHealth;
import org.springframework.boot.actuate.health.Health;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeServiceBeanFactory {

    @Bean
    public CurrentHealth getCurrentHealth() {
        return new CurrentHealth(Health.up().build());
    }
}
