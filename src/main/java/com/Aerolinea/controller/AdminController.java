package com.Aerolinea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//El usuario admin es el que tiene la autorizacion de ver la lista de vuelos, ademas de eliminar, agregar o modificar vuelos

@Controller
@RequestMapping("/admin")
public class AdminController {
    public AdminController() {
    }

    @GetMapping()
    public String index() {
        return "admin";
    }
    //Retorna la vista admin
}