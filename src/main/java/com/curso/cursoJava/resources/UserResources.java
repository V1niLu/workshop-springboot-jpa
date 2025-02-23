package com.curso.cursoJava.resources;

import com.curso.cursoJava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //controlador REST para lidar com requisições HTTP e retornar respostas JSON
@RequestMapping("/users") //Define o caminho das requisições que esta classe ira tratar
public class UserResources {

    @GetMapping //responde a requisições HTTP do tipo GET  para o endpoint "users"
    public ResponseEntity<User> findAll(){ //retorna todos os usuarios de USER
        //responseEntity - representa respostas HTTP em controladores Rest
        //no caso o ResponseEntity contem um objeto User
        
        User user = new User(1L, "Maria", "maria@gmail.com", "999999999", "password");
        return ResponseEntity.ok().body(user); //retorna 200ok mais o corpo da requisição user
    }

}
