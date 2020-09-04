package com.tecnara.usuarios;

public class Externo extends Usuario implements AUtentificarEmpresa {
    private String tipoDeUsuario = "Externo";
    private String compania;
    public Externo(String nombre, String apellido, String telefono, String email, String tipoDeUsuario) {
        super(nombre, apellido, telefono, email);
        this.tipoDeUsuario = tipoDeUsuario;
        message();
        this.getCompanyid();
        this.compania = compania;

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

    @Override
    public String AUtentificarEmpresa() {
        return null;
    }
}
