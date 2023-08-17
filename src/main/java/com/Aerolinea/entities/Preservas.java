/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
//Conexion a la tabla roles del esquema AerlineaDB
@Table(name = "Preservas")
public class Preservas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPreservas;
    
    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private Long id_vuelo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Long id_cliente;

}
