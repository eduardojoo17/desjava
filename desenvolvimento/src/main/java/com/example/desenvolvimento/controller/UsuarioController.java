package com.example.desenvolvimento.controller;

import java.util.List;
import java.util.ArrayList;
import com.example.desenvolvimento.model.Usuario;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> ListarUsuarios(){
        return usuarios;
    }

    @PostMapping
    public criarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return ResponseEntity.ok(usuario);
    }


}