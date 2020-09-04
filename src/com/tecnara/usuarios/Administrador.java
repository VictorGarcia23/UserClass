package com.tecnara.usuarios;

public class Administrador extends Usuario{
    private String tipoDeUsuario = "Administrador";
    private String goldenkey;

    public Administrador(String nombre, String apellido, String telefono, String email, String tipoDeUsuario, String goldenkey) {
        super(nombre, apellido, telefono, email);
        this.tipoDeUsuario = tipoDeUsuario;
        message();
        this.goldenkey = goldenkey;
        autenticarSuperUsuario("12345678");
    }

    @Override
    public String message() {
        System.out.println("Bienvenido, eres: " + getNombre() + getApellido() + " " + tipoDeUsuario);
        return null;

    }

    @Override
    public String autenticarSuperUsuario() {
        return null;
    }
}
