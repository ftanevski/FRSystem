package com.example.frsystem.Repos;

import com.example.frsystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    Optional<User> findByUsername(String Username);
    Optional<User> findByEmail(String Email);
    Optional<User> findByUsernameAndPassword(String username, String password);
}
