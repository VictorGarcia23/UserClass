package com.tecnara.usuarios;

public class Base extends Usuario{
    private String tipoDeUsuario = "Base";

    public Base(String nombre, String apellido, String telefono, String email, String tipoDeUsuario) {
        super(nombre, apellido, telefono, email);
        this.tipoDeUsuario = tipoDeUsuario;
        message();
    }

    @Override
    public String message() {
        System.out.println("Bienvenido, eres: " + getNombre() + getApellido() + " " + tipoDeUsuario );
        return null;
    }


    @Override
    public String autenticarSuperUsuario() {
        return null;
    }
}
