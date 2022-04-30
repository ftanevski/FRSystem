package com.example.frsystem.Services.Impl;

import com.example.frsystem.Model.Exceptions.FieldsNotPopulatedException;
import com.example.frsystem.Model.Exceptions.InvalidUserCredentialsException;
import com.example.frsystem.Model.User;
import com.example.frsystem.Repos.UserRepo;
import com.example.frsystem.Services.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepo userRepo;

    public AuthenticationServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public User login(String username, String password) {
        if(username == null || username.isEmpty() || password == null || password.isEmpty()){
            throw new FieldsNotPopulatedException();
        }
        return userRepo.findByUsernameAndPassword(username, password).orElseThrow(InvalidUserCredentialsException::new);
    }
}
