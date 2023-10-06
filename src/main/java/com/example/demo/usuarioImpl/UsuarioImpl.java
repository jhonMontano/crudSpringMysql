package com.example.demo.usuarioImpl;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;
import java.util.Optional;

public interface UsuarioImpl {
    ArrayList<UsuarioModel> obtenerUsuarios();
    UsuarioModel guardarUsuario(UsuarioModel usuarioModel);
    ArrayList<UsuarioModel> guardarUsuarios(ArrayList<UsuarioModel> usuariosNuevos);
    Optional<UsuarioModel> obtenerPorId(Long id);
    ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad);
    boolean eliminarUsuario(Long id);

}

