/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.entities;

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;

/**
 *
 * @author LABORATORIO 04
 */
@Entity
@Data
//Conexion a la tabla roles del esquema AerlineaDB
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    private String contrasena;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private int id_rol;
    private Roles roles;

    public Roles getRoles() {
        return roles;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
     public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
