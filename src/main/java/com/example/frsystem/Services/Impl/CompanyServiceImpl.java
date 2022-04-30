package com.example.frsystem.Services.Impl;

import com.example.frsystem.Model.Company;
import com.example.frsystem.Model.Exceptions.CategoryDoesNotExistException;
import com.example.frsystem.Repos.CompanyRepo;
import com.example.frsystem.Services.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepo companyRepo;

    public CompanyServiceImpl(CompanyRepo companyRepo){
        this.companyRepo = companyRepo;
    }

    @Override
    public List<Company> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public List<Company> findByCategory(String category) {
        return companyRepo.findByCategory(category);
    }
}
