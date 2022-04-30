package com.example.frsystem.Services;

import com.example.frsystem.Model.Project;
import com.example.frsystem.Model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User register(String username, String email, String password, String repeatPassword);
    User addProject(String Username, String projectName);
}
