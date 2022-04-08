package com.example.projetjee.model.dao;
import java.util.List;

import com.example.projetjee.bean.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratDao extends JpaRepository<Contrat, Long>{
    
	Contrat findByEmployeeRef(String ref);
	
	int deleteByEmployeeRef(String ref);
	
	List<Contrat> findByEmployeeSalaireActuelGreaterThan(double salaireActuel);
	
	Contrat findByTypeContratCode(String code);
	
	int deleteByTypeContratCode(String code);
	
	Contrat findBySocieteIce(String ice);
	
	int deleteBySocieteIce(String ice);
}
