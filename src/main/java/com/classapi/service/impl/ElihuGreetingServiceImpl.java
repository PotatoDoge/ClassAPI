package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("elihu")
@Slf4j

public class ElihuGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("Ey muy buenas a todos, guapísimos aquí a Elihú");
        log.info("Este mensaje es propio de mi servicio de bienvenida.");
        return "Saludos a todos, mi nombre es Elihú y la hora de hoy es " + now() +".";
    }

}