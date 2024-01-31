package com.example.msusuarios.controller;

import com.example.msusuarios.dto.UsuarioDTO;
import com.example.msusuarios.mapper.UsuarioMapper;
import com.example.msusuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class usuariosController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAllUsuarios() {
        try {
            List<UsuarioDTO> usuariosDTO = usuarioService.getAllUsuarios().stream()
                .map(usuarioMapper::modelToDto)
                .collect(Collectors.toList());
            return ResponseEntity.ok(usuariosDTO);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<UsuarioDTO> getUsuarioByNombre(@PathVariable String nombre) {
        try {
            UsuarioDTO usuarioDTO = usuarioMapper.usuarioModelToDTO(usuarioService.getUsuarioByNombre(nombre));
            return ResponseEntity.ok(usuarioDTO);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        try {
            usuarioService.createUsuario(usuarioMapper.usuarioDTOToModel(usuarioDTO));
            return new ResponseEntity<>(usuarioDTO, HttpStatus.CREATED);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}