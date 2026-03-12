package com.classapi.service.impl;


import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service
@Slf4j
public class JaredGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("Jared esta saludando");
        log.info("KIUVO soy Ruben");
        return "Hola mundo, soy Jared Ruben Delgado Singh, la hora de hoy es: " + now();
    }
}
