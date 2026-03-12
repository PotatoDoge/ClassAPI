package com.classapi.service.impl;

import com.classapi.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static java.time.LocalTime.now;
@Service("Sergio")
@Slf4j
public class Saludo implements GreetingService{
    @Override
    public String greeting(){
        System.out.println("Hola soy Sergio");
        return "Hola soy sergio" + now() ;
    }

}
