package com.example.projetjee.model.ws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projetjee.bean.Contrat;
import com.example.projetjee.model.service.ContratService;

@RestController
@RequestMapping("impotsurrevenu/Contrat")
public class ContratWs {

    @PostMapping("/")
	public int save(@RequestBody Contrat contrat) {
		return contratService.save(contrat);
	}
    @GetMapping("/employee/ref/{ref}")
	public Contrat findByEmployeeRef(@PathVariable String ref) {
		return contratService.findByEmployeeRef(ref);
	}
    @DeleteMapping("/employee/ref/{ref}")
	public int deleteByEmployeeRef(@PathVariable String ref) {
		return contratService.deleteByEmployeeRef(ref);
	}
    @GetMapping("/employee/salaireActuel/{salaireActuel}")
	public List<Contrat> findByEmployeeSalaireActuelGreaterThan(@PathVariable double salaireActuel) {
		return contratService.findByEmployeeSalaireActuelGreaterThan(salaireActuel);
	}
    @GetMapping("/typecontrat/code/{code}")
	public Contrat findByTypeContratCode(@PathVariable String code) {
		return contratService.findByTypeContratCode(code);
	}
    @DeleteMapping("/typecontrat/code/{code}")
	public int deleteByTypeContratCode(@PathVariable String code) {
		return contratService.deleteByTypeContratCode(code);
	}
	@GetMapping("/")
	public List<Contrat> findAll() {
		return contratService.findAll();
	}
	@GetMapping("/Societe/ice/{ice}")
	public Contrat findBySocieteIce(String ice) {
		return contratService.findBySocieteIce(ice);
	}
	@DeleteMapping("/societe/ice/{ice}")
	public int deleteBySocieteIce(String ice) {
		return contratService.deleteBySocieteIce(ice);
	}

	@Autowired
	private ContratService contratService;
}