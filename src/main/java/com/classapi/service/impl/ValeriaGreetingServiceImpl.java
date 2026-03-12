package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.time.LocalTime.now;

@Service("Valeria")
@Slf4j
public class ValeriaGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        log.info("Wenaas, soi vAleRia!");
        log.info("Este mensaje fue creado nomas para testear este coso");
        return "Vale Ria aqui y ahorita son las " + now() + ", pongase a chambear!";
    }
}
