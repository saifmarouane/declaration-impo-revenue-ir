package com.example.projetjee.model.service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.projetjee.bean.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projetjee.bean.Contrat;
import com.example.projetjee.bean.Employee;
import com.example.projetjee.bean.Societe;
import com.example.projetjee.bean.TypeContrat;
import com.example.projetjee.model.dao.ContratDao;

@Service
public class ContratService {
	
	public int save(Contrat contrat) {
		
		Employee employee = employeeService.findByRef(contrat.getEmployee().getRef());
		contrat.setEmployee(employee);
		TypeContrat typeContrat = typeContratService.findByCode(contrat.getTypeContrat().getCode());
		contrat.setTypeContrat(typeContrat);
		Societe societe = societeService.findByIce(contrat.getSociete().getIce());
		contrat.setSociete(societe);
		
		if(employee == null || typeContrat == null || societe==null ) {
			return -1;
		}
		else if(contrat.getDateResiliation().before(contrat.getDateDemarage())) {
			return -2;
		}
		else {
			contratDao.save(contrat);
		    return 1;
		}
	}
	
	public Contrat findByEmployeeRef(String ref) {
		return contratDao.findByEmployeeRef(ref);
	}
	@Transactional
	public int deleteByEmployeeRef(String ref) {
		return contratDao.deleteByEmployeeRef(ref);
	}
    //p
	public List<Contrat> findByEmployeeSalaireActuelGreaterThan(double salaireActuel) {
		return contratDao.findByEmployeeSalaireActuelGreaterThan(salaireActuel);
	}
    //p
	public Contrat findByTypeContratCode(String code) {
		return contratDao.findByTypeContratCode(code);
	}
	@Transactional
	public int deleteByTypeContratCode(String code) {
		return contratDao.deleteByTypeContratCode(code);
	}
    
	public Contrat findBySocieteIce(String ice) {
		return contratDao.findBySocieteIce(ice);
	}

	public int deleteBySocieteIce(String ice) {
		return contratDao.deleteBySocieteIce(ice);
	}

	public List<Contrat> findAll() {
		return contratDao.findAll();
	}
    
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private TypeContratService typeContratService;
	@Autowired
	private SocieteService societeService;
	@Autowired
	private ContratDao contratDao;
	
}
