package com.example.frsystem.Services;

import com.example.frsystem.Model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    List<Company> findByCategory();

}
