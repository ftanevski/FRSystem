package com.example.frsystem.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    public Project(){}

    @Id
    private String name;
    private String description;
    @ManyToMany
    private List<Company> companies;
}
