package com.tecnara.usuarios;

public class Sistema extends Usuario{
    private String tipoDeUsuario = "Sistema";
    private String goldenkey;
    public Sistema(String nombre, String apellido, String telefono, String email, String tipoDeUsuario, String goldenkey) {
        super(nombre, apellido, telefono, email);
        this.tipoDeUsuario = tipoDeUsuario;
        message();
        this.goldenkey = goldenkey;
        autenticarSuperUsuario("1234567");

    }

    @Override
    public String message() {
        System.out.println("Bienvenido, eres: " + getNombre() + " " + getApellido() + " " + tipoDeUsuario);
        return null;

    }

    @Override
    public String autenticarSuperUsuario() {
        return null;
    }
}
