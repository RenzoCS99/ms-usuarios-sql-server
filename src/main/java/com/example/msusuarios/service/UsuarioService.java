package com.example.msusuarios.service;

import com.example.msusuarios.model.usuarioModel;
import com.example.msusuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Método para obtener todos los usuarios
    public List<usuarioModel> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    // Método para obtener un usuario por su nombre
    public usuarioModel getUsuarioByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    // Método para crear un nuevo usuario
    public usuarioModel createUsuario(usuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }
}
