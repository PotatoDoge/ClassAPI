package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("segovia")
@Slf4j
public class SegoviaGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("¡Hola, soy Segovia!");
        log.info("Mi youtuber favorito es Marmax");
        return "¡Hola, soy Alejandro Segovia, y la hora de hoy es " + now() + "!";
    }
}
