package es.pedrogalan.time.service.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator {

    @Autowired
    private CurrentHealth currentHealth;

    @Override
    public Health health() {
        System.out.println("Checking health...");
        return currentHealth.getHealth();
    }
}
