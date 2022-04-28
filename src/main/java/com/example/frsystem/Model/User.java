package com.example.frsystem.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    public User (){}

    public User (Long id, String name, String surname, String email, String password){
        this.id = id;
        this.Name = name;
        this.Surname = surname;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String Surname;
    private String email;
    private String password;
    @OneToMany
    private List<Project> projects;
}
