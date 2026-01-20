package com.example.springboot_apirest.domain.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email(message = "El correo electrónico no es válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @Min(value = 18, message = "La edad mínima es 18")
    @Max(value = 99, message = "La edad máxima es 99")
    private int edad;

    @Valid
    private DirecionDTO direccion;

    public UsuarioDTO() {
    }

    public UsuarioDTO(@NotBlank(message = "El nombre es obligatorio") String nombre,
            @Email(message = "El correo electrónico no es válido") @NotBlank(message = "El email es obligatorio") String email,
            @Min(value = 18, message = "La edad mínima es 18") @Max(value = 99, message = "La edad máxima es 99") int edad,
            @Valid DirecionDTO direccion) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public DirecionDTO getDireccion() {
        return direccion;
    }

    public void setDireccion(DirecionDTO direccion) {
        this.direccion = direccion;
    }

    
}
