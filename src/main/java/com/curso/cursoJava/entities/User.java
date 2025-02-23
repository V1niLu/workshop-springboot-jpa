package com.curso.cursoJava.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class User implements Serializable {

    //serializable - para tranformar objetos em bits
    //parar trafegar na rede, possa ser gravados em arquivos...

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public User(){

    }

    public User(Long id, String nome, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
