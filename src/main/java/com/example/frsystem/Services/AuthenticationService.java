package com.example.frsystem.Services;

import com.example.frsystem.Model.User;

public interface AuthenticationService {

    User login(String username, String password);
}
