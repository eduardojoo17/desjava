package com.example.desenvolvimento.model;

import jakarta.validation.constraints.NotNull;

public class Usuario {
private int id;
@NotNull(message = "usuario é obrigatorio")
private String usuario;
private boolean ativo;


public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

