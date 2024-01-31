package com.example.msusuarios.repository;

import com.example.msusuarios.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<usuarioModel, Long> {

    // Método para obtener todos los usuarios
    List<usuarioModel> findAll();

    // Método para obtener un usuario por su nombre
    usuarioModel findByNombre(String nombre);

    // Método para crear un nuevo usuario
    usuarioModel save(usuarioModel usuario);
}
