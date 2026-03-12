package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("mariana")
@Slf4j
public class MarianaGreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        log.info("hola soy mariana angelica :)");
        log.info("no se q poner en este mensaje");
        return "hola soy mariana y amo a rauw <3";
    }
}
