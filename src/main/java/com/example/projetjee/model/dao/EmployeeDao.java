package com.example.projetjee.model.dao;

import java.util.List;

import com.example.projetjee.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
   Employee findByRef(String ref);
   int  deleteByRef(String ref);
   List<Employee> findByRefLikeAndSalaireActuelGreaterThan(String ref, double salaireActuel);
   // min max @query
}
