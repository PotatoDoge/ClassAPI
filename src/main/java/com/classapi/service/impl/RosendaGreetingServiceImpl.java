package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static java.time.LocalTime.now;

@Service("Rosenda")
@Slf4j
public class RosendaGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("Hii, soy Rosenda");
        log.info("Este mensaje está en mi propio servicio");
        return "Hii, soy Rosenda, espero tengan bonito dia!";
    }
}
