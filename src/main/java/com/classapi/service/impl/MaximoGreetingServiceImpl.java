package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;
@Service("Maximo")
@Slf4j
public class MaximoGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        log.info("¡Hola, soy Maximo!");
        log.info("Este mensaje está en mi propio servicio!!");
        return "¡Hola, soy Maximo, y la hora de hoy es " + now() + "!";
    }
}
