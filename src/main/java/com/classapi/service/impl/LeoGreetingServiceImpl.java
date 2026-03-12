package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

import static java.time.LocalTime.now;

@Service("leo")
@Slf4j public class LeoGreetingServiceImpl implements GreetingService {
    @Override public String greeting(){
     log.info("Hola soy Leo!");
     log.info("Este mensaje es para probar mi servicio creado");
     return "Q onda soy Leo y la fecha de hoy es: " + now() + "!";
    }
}
