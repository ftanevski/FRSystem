package com.example.frsystem.Services.Impl;

import com.example.frsystem.Model.Company;
import com.example.frsystem.Services.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Override
    public List<Company> findAll() {
        return null;
    }

    @Override
    public List<Company> findByCategory() {
        return null;
    }
}
