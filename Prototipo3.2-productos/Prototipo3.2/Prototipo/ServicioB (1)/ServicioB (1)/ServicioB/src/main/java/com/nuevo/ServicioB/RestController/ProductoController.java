package com.nuevo.ServicioB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde Spring Boot";
    }
}
