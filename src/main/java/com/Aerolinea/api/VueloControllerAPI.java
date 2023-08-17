/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.api;

import com.Aerolinea.entities.Vuelos;
import com.Aerolinea.service.IVuelosService;
import java.io.FileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("api/product")
public class VueloControllerAPI {
    private final IVuelosService vuelosService;

    public VueloControllerAPI(IVuelosService vuelosService) {
        this.vuelosService = vuelosService;
    }

    @GetMapping("/all")
    public List<Vuelos> getAll() {
        return this.vuelosService.getAll();
    }

    @GetMapping()
    public Vuelos getById(@RequestParam("idVuelos") int id) {
        var vuelos = this.vuelosService.getById(id);
        if (vuelos.isPresent()) {
            return vuelos.get();
        }
        throw new ResponseStatusException(NOT_FOUND, "Unable to find resource");
    }

    @PostMapping()
    public Vuelos save(@RequestBody Vuelos vuelos) {
        return this.vuelosService.save(vuelos);
    }

    @DeleteMapping()
    public ResponseEntity<String> delete(@RequestBody Vuelos vuelos) {
        this.vuelosService.delete(vuelos);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
