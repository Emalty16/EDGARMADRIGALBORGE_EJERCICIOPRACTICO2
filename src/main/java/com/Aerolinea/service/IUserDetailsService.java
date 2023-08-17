/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aerolinea.service;

import org.springframework.security.core.userdetails.*;

public interface IUserDetailsService {
    
    public UserDetails loadUserByUsername(String nombre_usuario) throws UsernameNotFoundException;
    
}
