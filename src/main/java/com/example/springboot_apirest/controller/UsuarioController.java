package com.example.springboot_apirest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_apirest.domain.dto.UsuarioDTO;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @PostMapping("/crear")
    public UsuarioDTO crearUsuario(@Valid @RequestBody UsuarioDTO entity) {
        return entity;
    }
    
}
