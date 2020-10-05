package com.ming.kiworkshoptest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class LoggingController {
    @GetMapping("/info")
    public String info() {
        log.info("info api log");
        return "INFO";
    }

    @GetMapping("/warn")
    public String warn() {
        log.warn("warn api log");
        return "WARN";
    }

    @GetMapping("/error")
    public String error() {
        log.error("error api log");
        return "ERROR";
    }

    @GetMapping("/all")
    public String all() {
        log.info("info api log");
        log.warn("warn api log");
        log.error("error api log");
        return "ALL LOG LEVEL";
    }
}
