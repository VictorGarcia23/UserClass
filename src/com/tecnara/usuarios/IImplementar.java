package com.tecnara.usuarios;

public interface IImplementar {
    public static String welcomeMessage(Usuario usuario){
        return usuario.message();
    }
}
