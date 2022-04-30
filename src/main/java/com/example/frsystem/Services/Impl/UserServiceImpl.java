package com.example.frsystem.Services.Impl;

import com.example.frsystem.Model.Exceptions.*;
import com.example.frsystem.Model.Project;
import com.example.frsystem.Model.User;
import com.example.frsystem.Repos.ProjectRepo;
import com.example.frsystem.Repos.UserRepo;
import com.example.frsystem.Services.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ProjectRepo projectRepo;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepo userRepo, PasswordEncoder passwordEncoder, ProjectRepo projectRepo, ProjectServiceImpl projectService){
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.projectRepo = projectRepo;
    }

    @Override
    public User register(String username, String email, String password, String repeatPassword) {
        if(username == null || username.isEmpty() || email==null || email.isEmpty() || password==null || password.isEmpty()){
            throw new FieldsNotPopulatedException();
        }
        if(!password.equals(repeatPassword)){
            throw new PasswordsDontMatchException();
        }
        if(this.userRepo.findByUsername(username).isPresent()){
            throw new UsernameAlreadyExistsException();
        }
        if(this.userRepo.findByEmail(email).isPresent()){
            throw new EmailAlreadyExistsException();
        }
        User user = new User(username, email, passwordEncoder.encode(password));
        return userRepo.save(user);
    }

    @Override
    public User addProject(String Username, String projectName) {
        Project project1 = projectRepo.findByName(projectName);
        User user = userRepo.findByUsername(Username).orElseThrow(UserNotFoundException::new);
        user.getProjects().add(project1);
        return userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
    }
}
