package com.example.frsystem.Services.Impl;

import com.example.frsystem.Model.Company;
import com.example.frsystem.Model.Project;
import com.example.frsystem.Services.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<Project> findAll() {
        return null;
    }

    @Override
    public List<Project> findForCompany(String name) {
        return null;
    }

    @Override
    public Project createNewProject(String name, String descriptions, List<Company> companies) {
        return null;
    }
}
