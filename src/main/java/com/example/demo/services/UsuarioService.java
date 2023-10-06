package com.example.demo.services;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.usuarioImpl.UsuarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService implements UsuarioImpl {
    @Autowired
    UsuarioRepository usuariorepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuariorepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuarioModel){
        return usuariorepository.save(usuarioModel);
    }

    public ArrayList<UsuarioModel> guardarUsuarios(ArrayList<UsuarioModel> usuariosNuevos){
        return (ArrayList<UsuarioModel>) usuariorepository.saveAll(usuariosNuevos);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuariorepository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return usuariorepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id){
        try {
            usuariorepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
