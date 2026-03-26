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
    public ResponseEntity criarUsuario(@RequestBody Usuario usuario){
        if(usuario.getUsuario()==null){
            return ResponseEntity.badRequest().body("campo vazio");
        }
        usuarios.add(usuario);
        return ResponseEntity.ok(usuario);
    }


}