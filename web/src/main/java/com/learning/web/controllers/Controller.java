package com.learning.web.controllers;

import com.learning.web.Repositories.Interface.IUserRepo;
import com.learning.web.models.entities.User;
import com.learning.web.models.requests.InsertUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controllers")
public class Controller {
    @Autowired
    private IUserRepo jpaRepo;

    @GetMapping
    public ResponseEntity get() {
        return new ResponseEntity(jpaRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping

    public ResponseEntity post(@RequestBody InsertUserRequest user) {
        User newUser = User.builder()
                .username(user.getUsername())
                .age(user.getAge())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
        return new ResponseEntity(jpaRepo.save(newUser), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity put() {
        return new ResponseEntity(jpaRepo.findAll(), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity delete() {
        return new ResponseEntity(jpaRepo.findAll(), HttpStatus.OK);
    }
}
