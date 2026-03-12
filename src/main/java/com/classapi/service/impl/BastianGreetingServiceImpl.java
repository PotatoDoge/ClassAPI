package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static java.time.LocalTime.now;

@Service("bastian")
@Slf4j
public class BastianGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("¡Hola, soy Nico");
        log.info("Mateo Guapo, Hola hola hola");
        log.info("Este mensaje está en mi propio servicio. Ya no");
        return "MATEOOOOOOOO ¡Hola, soy Nicolás, y la hora de hoy es " + now() + "!. Tengo sueño";
    }
}
