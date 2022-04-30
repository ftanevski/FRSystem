package com.example.frsystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

    public Company(){}

    @Id
    private String companyName;
    private String address;
    private String phone;
    private String category;
}
