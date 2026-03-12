package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("Yuliette")
@Slf4j
public class YulietteGreeting implements GreetingService {
    @Override
    public String greeting() {
        log.info("Hoy es un buen día para cafecito con lavanda...");
        return "Buenos días, ve por tu lavanda latte hoy " + 11 + " de marzo." ;
    }



}
