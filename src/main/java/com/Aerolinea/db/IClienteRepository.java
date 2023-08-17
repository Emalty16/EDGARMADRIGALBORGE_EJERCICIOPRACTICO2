/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aerolinea.db;

import com.Aerolinea.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IClienteRepository extends JpaRepository<Cliente, Long>{
    
    Cliente findByUsername(String nombre_usuario);
    
    Cliente findByUsernameAndContrasena(String nombre_usuario, String contrasena);
        
    Cliente findByUsernameOrCorreo(String nombre_usuario, String correo);
    
    boolean existsByUsernameOrCorreo (String nombre_usuario, String correo);
    
}
