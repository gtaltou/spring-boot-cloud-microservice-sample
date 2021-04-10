package com.taltou.companyservice.dao;

import com.taltou.companyservice.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
