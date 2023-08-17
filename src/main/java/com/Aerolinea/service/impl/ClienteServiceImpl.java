/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.service.impl;

import com.Aerolinea.db.IClienteRepository;
import com.Aerolinea.db.IRolesRepository;
import com.Aerolinea.entities.Cliente;
import com.Aerolinea.entities.Roles;
import com.Aerolinea.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired 
    private IClienteRepository clientedb;
    @Autowired
    private IRolesRepository roldb;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes(){
        return clientedb.findAll();
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente){
        return clientedb.findById(cliente.getIdCliente()).orElse(null);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cliente getClientePorUsername(String username){
        return clientedb.findByUsername(username);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cliente getClientePorUsernameYContrasena(String nombre_usuario, String contrasena){
        return clientedb.findByUsernameAndContrasena(nombre_usuario,contrasena);
             
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cliente getClientePorUsernameOCorreo(String username, String correo){
        return clientedb.findByUsernameOrCorreo(username,correo);
    }
    
    @Override
    @Transactional(readOnly = true)
    public void save (Cliente cliente, boolean crearRolUser){
        cliente = clientedb.save(cliente);
        if (crearRolUser) {
            Roles rol = new Roles();
            rol.setNombre("ROLE_USER");
            rol.setIdRol(cliente.getIdCliente());
            roldb.save(rol);
        }
    }
    
    @Override
    @Transactional(readOnly = true)
    public void delete(Cliente cliente){
        clientedb.delete(cliente);
    }
    

    @Override
    public boolean existeClientePorSemanaOCorreo(String nombre_usuario, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
