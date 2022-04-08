package com.example.projetjee.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetjee.bean.TypeContrat;


@Repository
public interface TypeContratDao extends JpaRepository<TypeContrat, Long> {
	
	TypeContrat findByCode(String code);
	int deleteByCode(String code);
}
