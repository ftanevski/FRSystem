package com.example.frsystem.Repos;

import com.example.frsystem.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepo extends JpaRepository<Project, String> {
    Project findByName(String name);
    Optional<Project> findByCompany(String name);
}
