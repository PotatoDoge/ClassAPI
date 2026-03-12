package com.classapi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("Bryan")
@Slf4j
public class BryanGreetingServiceImpl {
    public String greeting(){
        log.info("Que tal soy sechh");
        log.info("Este mensaje esta en mi porpio servicio");
        return "que tal soy sech y la hora de hoy es :" + now() + "";
    }
}
