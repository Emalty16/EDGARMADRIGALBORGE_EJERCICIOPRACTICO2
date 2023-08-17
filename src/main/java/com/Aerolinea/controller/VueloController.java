/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.controller;

import com.Aerolinea.entities.Vuelos;
import com.Aerolinea.service.IVuelosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VueloController {
    private final IVuelosService vueloService;

    public VueloController(IVuelosService vueloService) {
        this.vueloService = vueloService;
    }

    @GetMapping("/vuelo")
     public String index(Model model) {
        var baseProduct = new Vuelos();
        model.addAttribute("vueloDefault", baseProduct);
        model.addAttribute("vuelos", this.vueloService.getAll());
        //model.addAttribute("categories", this.categoryService.getAll());
        return "product";
    }

    
 

}
