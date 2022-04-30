package com.example.frsystem.Services.Impl;

import com.example.frsystem.Model.Company;
import com.example.frsystem.Model.Project;
import com.example.frsystem.Repos.ProjectRepo;
import com.example.frsystem.Services.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;

    public ProjectServiceImpl(ProjectRepo projectRepo){
        this.projectRepo = projectRepo;
    }

    @Override
    public List<Project> findAll() {
        return projectRepo.findAll();
    }

    @Override
    public Optional<Project> findForCompany(String name) {
        return projectRepo.findByCompany(name);
    }

    @Override
    public Project createNewProject(String name, String descriptions, List<Company> companies) {
        return null;
    }
}
