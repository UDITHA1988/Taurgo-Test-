package com.example.Test.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class usersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public ResponseEntity<List<users>> getUsers(){
        return new ResponseEntity<List<users>>(usersService.Allusers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<users>> getSingleUser(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<users>>(usersService.singleUser(id), HttpStatus.OK);
    }
}
