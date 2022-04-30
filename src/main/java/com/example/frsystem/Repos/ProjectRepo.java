package com.example.frsystem.Repos;

import com.example.frsystem.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, String> {
    Project findByName(String name);
}
