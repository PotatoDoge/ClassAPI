package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("francisco")
@Slf4j
public class FranciscoGreetingServiceImpl implements GreetingService {
    @Override
    public String  greeting(){
        log.info("Hola soy Francisco");
        log.info("Este mensaje esta en mi propio servidor");
        return "Hola, soy Franciso, y la hora de hoy es "+now() + "!";
    }
}
