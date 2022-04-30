package com.example.frsystem.Repos;

import com.example.frsystem.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String> {

    List<Company> findByCategory(String category);

}
