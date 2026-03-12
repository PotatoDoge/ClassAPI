package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("sinai")
@Slf4j
public class SinaiGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting(){
        log.info("¡Hola, soy ... y me faltó (y me falta todavía) piso jaja lol lmao (:'c)!");
        log.info("Este mensaje está en mi propio servicio");
        return "¡Hola, Soy sinAI, y la hora de hoy es "+ now() + "!";
    }



}
