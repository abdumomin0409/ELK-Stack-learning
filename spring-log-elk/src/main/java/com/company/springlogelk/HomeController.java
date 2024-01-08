package com.company.springlogelk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home() {
        LocalDateTime now = LocalDateTime.now();
        log.info("Welcome home page at {}", now);
        return "Welcome to home page ";
    }

    @GetMapping("/logs")
    public String logs() {
        LocalDateTime now = LocalDateTime.now();
        log.info("Welcome logs page at {}", now);
        return "Welcome to logs page ";
    }


}
