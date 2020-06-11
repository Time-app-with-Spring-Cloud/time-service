package es.pedrogalan.time.service.controller;

import es.pedrogalan.time.service.TimeServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {

    @Autowired
    private TimeServiceConfiguration configuration;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @RequestMapping("/")
    public String time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(configuration.getTimeformat());
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now) + "(from " + instanceId + ")";
    }
}