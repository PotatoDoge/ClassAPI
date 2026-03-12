package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static java.time.LocalTime.now;

@Service("Luis")
@Slf4j
public class LuisGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("¡Hola, soy Luis!");
        log.info("Este mensaje está para decir Wenomechainsuma tumajarbisaun wifenlooof 👻");
        return "¡Hola, soy luis, osiiiiiiiiii";
    }
}