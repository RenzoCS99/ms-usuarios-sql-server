package com.example.msusuarios.mapper;

import com.example.msusuarios.dto.UsuarioDTO;
import com.example.msusuarios.model.usuarioModel;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioDTO modelToDto(usuarioModel usuarioModel) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuarioModel.getNombre());
        usuarioDTO.setContraseña(usuarioModel.getContraseña());
        usuarioDTO.setCorreo(usuarioModel.getCorreo());
        return usuarioDTO;
    }

    public usuarioModel dtoToModel(UsuarioDTO usuarioDTO) {
        usuarioModel usuarioModel = new usuarioModel();
        usuarioModel.setId(usuarioDTO.getId()); 
        usuarioModel.setNombre(usuarioDTO.getNombre());
        usuarioModel.setContraseña(usuarioDTO.getContraseña());
        usuarioModel.setCorreo(usuarioDTO.getCorreo());
        return usuarioModel;
    }
    public UsuarioDTO usuarioModelToDTO(usuarioModel usuarioModel) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuarioModel.getNombre());
        usuarioDTO.setContraseña(usuarioModel.getContraseña());
        usuarioDTO.setCorreo(usuarioModel.getCorreo());
        return usuarioDTO;
    }

    public usuarioModel usuarioDTOToModel(UsuarioDTO usuarioDTO) {
        usuarioModel usuarioModel = new usuarioModel();
        usuarioModel.setId(usuarioDTO.getId()); 
        usuarioModel.setNombre(usuarioDTO.getNombre());
        usuarioModel.setContraseña(usuarioDTO.getContraseña());
        usuarioModel.setCorreo(usuarioDTO.getCorreo());
        return usuarioModel;
    }
}
