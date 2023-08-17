/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aerolinea.service;

import com.Aerolinea.entities.Cliente;
import java.util.List;

public interface IReservaService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public Cliente getClientePorUsername(String nombre_usuario);
    
    public Cliente getClientePorUsernameYContrasena(String nombre_usuario, String contrasena);
    
    public Cliente getClientePorUsernameOCorreo(String nombre_usuario, String correo);
    
    public boolean existeClientePorSemanaOCorreo(String nombre_usuario, String correo);
    
    public void save (Cliente cliente, boolean crearRoles);
    
    public void delete(Cliente cliente);
    
}
