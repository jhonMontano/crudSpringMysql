package com.example.demo.controllers;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping("/obtenerUsuarios")
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    @PostMapping("/guardarUsuario")
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuarioModel){
        return this.usuarioService.guardarUsuario(usuarioModel);
    }
    @GetMapping("/obtenerPorId/{id}")
    public Optional<UsuarioModel> obtenerPorId(@PathVariable Long id){
        return this.usuarioService.obtenerPorId(id);
    }
    @GetMapping("/obtenerPorPrioridad/{prioridad}")
    public ArrayList<UsuarioModel> obtenerPorPrioridad(@PathVariable Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }
    @DeleteMapping("/eliminarUsuario/{id}")
    public boolean eliminarUsuario(@PathVariable Long id){
        return usuarioService.eliminarUsuario(id);
    }
}
