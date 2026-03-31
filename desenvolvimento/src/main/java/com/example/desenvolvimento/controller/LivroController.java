package com.example.desenvolvimento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import com.example.desenvolvimento.model.Livro;

@RestController
@RequestMapping("/livros")
public class LivroController {


    Private List<Livro> livros = new ArrayList <>();

    @GetMapping
    public List<Livro> ListarLivros() {
        return livros;
    }
    @PostMapping
    public criarUsuario(Livro livros){
        Livro.add()
    }

}
