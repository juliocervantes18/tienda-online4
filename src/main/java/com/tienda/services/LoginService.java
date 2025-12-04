/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.services;

import com.tienda.models.Usuario;

public class LoginService {

    public boolean autenticar(Usuario usuario) {
        return "armida".equals(usuario.getUsername()) && "12345".equals(usuario.getPassword());
    }
}
