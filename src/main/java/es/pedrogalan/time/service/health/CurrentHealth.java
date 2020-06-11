package es.pedrogalan.time.service.health;

import org.springframework.boot.actuate.health.Health;

public class CurrentHealth {

    private Health health;

    public CurrentHealth(Health health) {
        this.health = health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Health getHealth() {
        return health;
    }
}
