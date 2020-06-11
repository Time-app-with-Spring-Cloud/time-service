package es.pedrogalan.time.service.controller;

import es.pedrogalan.time.service.health.CurrentHealth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BackDoorController {

    @Autowired
    private CurrentHealth currentHealth;

    @RequestMapping(value = "/put-down", method = RequestMethod.PUT)
    public Object putDown() {
        currentHealth.setHealth(Health.down().build());
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/get-up", method = RequestMethod.PUT)
    public Object getUp() {
        currentHealth.setHealth(Health.up().build());
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

    }

}
