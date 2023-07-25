package com.project.userdepartment.controllers;

import com.project.userdepartment.entities.User;
import com.project.userdepartment.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional> findById(@PathVariable Long id){
        Optional user = repository.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        User obj = repository.save(user);
        return ResponseEntity.ok().body(obj);
    }

}
