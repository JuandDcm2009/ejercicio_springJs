package com.example.springboot_apirest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_apirest.domain.dto.ContactoDTO;

@RestController
@RequestMapping("/contactos")
public class ContactoController {
    
    @PostMapping("/crear")
    public ResponseEntity<ContactoDTO> crearContacto(@RequestBody ContactoDTO contacto) {
        System.out.println("se hizo una consulta");
        return ResponseEntity.ok(contacto);
    }
}
