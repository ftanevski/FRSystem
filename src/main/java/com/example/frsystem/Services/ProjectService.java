package com.example.frsystem.Services;

import com.example.frsystem.Model.Company;
import com.example.frsystem.Model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    List<Project> findForCompany(String name);
    Project createNewProject(String name, String descriptions, List<Company> companies);
}
