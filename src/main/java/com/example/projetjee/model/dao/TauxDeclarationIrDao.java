package com.example.projetjee.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetjee.bean.TauxDeclarationIr;


@Repository
public interface TauxDeclarationIrDao extends JpaRepository<TauxDeclarationIr, Long> {
	
	
//	public List<TauxDeclarationIr>  findBySalaireBruteGreaterThan(double salaire);
	

}