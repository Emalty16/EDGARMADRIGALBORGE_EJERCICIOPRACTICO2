/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Entity
@Data
//Conexion a la tabla roles del esquema AerlineaDB
@Table(name = "Reserva")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    
    private Date fecha_reserva;
    
    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private int id_vuelo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private int id_cliente;
}
