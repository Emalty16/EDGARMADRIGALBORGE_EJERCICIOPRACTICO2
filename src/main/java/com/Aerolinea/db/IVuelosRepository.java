/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aerolinea.db;

import com.Aerolinea.entities.Vuelos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IVuelosRepository extends JpaRepository<Vuelos, Long>{
    
    
}
