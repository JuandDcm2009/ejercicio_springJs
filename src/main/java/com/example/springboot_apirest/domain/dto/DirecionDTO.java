package com.example.springboot_apirest.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DirecionDTO {
    @NotBlank(message = "La calle es obligatoria")
    private String calle;

    @NotBlank(message = "La ciudad es obligatoria")
    private String ciudad;

    @Size(min = 5, max = 5, message = "El código postal debe tener 5 caracteres")
    private String codigoPostal;

    public DirecionDTO() {
    }

    public DirecionDTO(@NotBlank(message = "La calle es obligatoria") String calle,
            @NotBlank(message = "La ciudad es obligatoria") String ciudad,
            @Size(min = 5, max = 5, message = "El código postal debe tener 5 caracteres") String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}
