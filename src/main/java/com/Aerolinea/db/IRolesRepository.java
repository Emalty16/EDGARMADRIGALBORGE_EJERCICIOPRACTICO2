/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aerolinea.db;

import com.Aerolinea.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IRolesRepository extends JpaRepository<Roles, Long>{
    
}
