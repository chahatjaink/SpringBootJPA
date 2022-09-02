package com.JPAExample.JPAConnectivity.Repository;

import com.JPAExample.JPAConnectivity.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
//    Company findById(int id);
//    List<Company> findAll();
//    void deleteById(int id);
}
