package com.tecnara.usuarios;

import javax.xml.bind.DatatypeConverter;

public abstract class Usuario implements IImplementar, AUtenticable{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String tipoDeUsuario;
    private String companyid;
    private String goldenkey;
    private String res;
    public Usuario(String nombre, String apellido, String telefono, String email){
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    public abstract String message();

    public String companyid(String companyid){
        return companyid;

    }

    public String getCompanyid() {
        return companyid;
    }


    public String autenticarSuperUsuario(String res){
        String str = new String(DatatypeConverter.parseBase64Binary("user:123"));
        res = DatatypeConverter.printBase64Binary(str.getBytes());
        System.out.println(res);
        return res;
    }

    public String getRes() {
        this.res = res;
        return res;
    }
}
