package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("/manuel")
@Slf4j
public class ManuelGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting(){
        log.info("Manuel Manuel agarra mi chile y juega con el iiii jiji");
        log.info("Konnichiwa minasan, esto es un saludo");
        return "Hola, soy Manuel y la hora de hoy es" + now();
    }
}
