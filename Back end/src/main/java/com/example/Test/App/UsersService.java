package com.example.Test.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;

    public List<users> Allusers(){
        return usersRepository.findAll();
    }

    public Optional<users> singleUser(ObjectId id){
        return userRepository.findById(id);    }
}
