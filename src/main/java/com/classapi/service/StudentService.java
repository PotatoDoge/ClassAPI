package com.classapi.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class StudentService {

    private final Map<String, GreetingService> greetingServices;

    public StudentService(Map<String, GreetingService> greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String greeting(String studentName) {
        String greeting = greetingServices.get(studentName).greeting();
        if(Objects.isNull(greeting)){
            return "¡Hola, soy un estudiante desconocido!";
        }
        return greeting;
    }

}
