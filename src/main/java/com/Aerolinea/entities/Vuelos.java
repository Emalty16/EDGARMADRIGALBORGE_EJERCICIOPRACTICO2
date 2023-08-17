/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import lombok.Data;
import jakarta.persistence.*;


@Entity
@Data
//Conexion a la tabla roles del esquema AerlineaDB
@Table(name ="Vuelos")
public class Vuelos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idVuelo;
    
    private String numero_vuelo;
    private String destino;
    private String lugar_salida;
    private Time hora_salida;
    private Date fecha_salida;
    private Date fecha_llegada;
    private String modelo_avion;
    
    
    
    
}
