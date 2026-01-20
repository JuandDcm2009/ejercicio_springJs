package com.example.springboot_apirest.domain.dto;

public class ContactoDTO {
    private String nombreContacto;
    private String apellidoContacto;
    private String nroCelular;
    private String emailContacto;
    private String nroResidencia;
    
    public ContactoDTO() {
    }

    public ContactoDTO(String nombreContacto, String apellidoContacto, String nroCelular, String emailContacto,
        String nroResidencia) {
        this.nombreContacto = nombreContacto;
        this.apellidoContacto = apellidoContacto;
        this.nroCelular = nroCelular;
        this.emailContacto = emailContacto;
        this.nroResidencia = nroResidencia;
    }
    public String getNombreContacto() {
        return nombreContacto;
    }
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    public String getApellidoContacto() {
        return apellidoContacto;
    }
    public void setApellidoContacto(String apellidoContacto) {
        this.apellidoContacto = apellidoContacto;
    }
    public String getNroCelular() {
        return nroCelular;
    }
    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }
    public String getEmailContacto() {
        return emailContacto;
    }
    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }
    public String getNroResidencia() {
        return nroResidencia;
    }
    public void setNroResidencia(String nroResidencia) {
        this.nroResidencia = nroResidencia;
    }

    
}
