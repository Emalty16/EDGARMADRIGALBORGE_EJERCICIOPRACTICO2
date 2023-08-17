/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aerolinea.service.impl;

import com.Aerolinea.service.IUserDetailsService;
import com.Aerolinea.db.IClienteRepository;
import com.Aerolinea.entities.Cliente;
import com.Aerolinea.entities.Roles;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public abstract class UserDetailsServiceImpl implements IUserDetailsService, UserDetails {
    
    @Autowired
    private IClienteRepository clienteRepository;
    @Autowired
    private HttpSession session;
    
    @Override
    @Transactional (readOnly= true)
    public UserDetails loadUserByUsername(String nombre_usuario) throws UsernameNotFoundException {
        Cliente cliente = clienteRepository.findByUsername(nombre_usuario);
        if (cliente == null){
            throw new UsernameNotFoundException(nombre_usuario);
    }
              
        var roles = new ArrayList<GrantedAuthority>();
        for (Roles roles : cliente.getRoles()){
            roles.add(new SimpleGrantedAuthority(roles.getNombre()));
        }
        return new User (cliente., cliente.getPassword(), roles);
        
    
    }

}