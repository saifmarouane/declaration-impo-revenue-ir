package com.example.projetjee.model.service;

import java.util.List;

import com.example.projetjee.bean.TauxDeclarationIr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.projetjee.model.dao.TauxDeclarationIrDao;





@Service
public class TauxDeclarationIrService {

	public List<TauxDeclarationIr> findAll() {
		return tauxdeclarationirDao.findAll();
	}

//	public List<TauxDeclarationIr> findBySalaireBruteGreaterThan(double salaire) {
//		return tauxdeclarationirDao.findBySalaireBruteGreaterThan(salaire);
//	}

	public int save(TauxDeclarationIr tauxdeclarationir) {
		if(tauxdeclarationir.getSalaireMin()<0) {
			return -1;
			
		}else if (tauxdeclarationir.getSalaireMin() > tauxdeclarationir.getSalaireMax()) {
			return -2;
			
		}else if(tauxdeclarationir.getPourcentage()<0) {
			return -3;
			
		}else {
			tauxdeclarationirDao.save(tauxdeclarationir);
			return 1;
		}
		
	}
	


public TauxDeclarationIr getSalaireNet(Double salaireBrut) {
	 List<TauxDeclarationIr>  tauxDeclarationIrs= findAll();
	 
	 for (TauxDeclarationIr tauxDeclarationIr : tauxDeclarationIrs) {
		if(salaireBrut >= tauxDeclarationIr.getSalaireMin() && salaireBrut< tauxDeclarationIr.getSalaireMax() ) {
			
			return tauxDeclarationIr;
			}
		
	}
	 return null;
	
}
	
	
	
	@Autowired
	private TauxDeclarationIrDao tauxdeclarationirDao;

	
}

