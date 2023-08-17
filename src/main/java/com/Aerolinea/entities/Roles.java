/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.entities;

//Todas las importaciones que necesita
import jakarta.persistence.Table;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
//Conexion a la tabla roles del esquema AerlineaDB
@Table(name ="Roles")

public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idRol;
    
    @NotEmpty
    private String nombre;
}
