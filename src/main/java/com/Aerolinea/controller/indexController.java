/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Le avisa al proyecto que esto es un controller
@Controller
public class indexController {
    @GetMapping("/")
    public String index() {
        return "index";
        //Este GetMapping es para ir al inicio
    }
}
