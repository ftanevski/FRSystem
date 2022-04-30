package com.example.frsystem.Services;

import com.example.frsystem.Model.Company;
import com.example.frsystem.Model.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<Project> findAll();
    Optional<Project> findForCompany(String name);
    Project createNewProject(String name, String descriptions, List<Company> companies);
}
