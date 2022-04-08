package com.example.projetjee.model.ws;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.projetjee.bean.Societe;
import com.example.projetjee.model.service.SocieteService;

import java.util.List;

@RestController
@RequestMapping("impot/Societe")
public class SocieteProvided {

    @Autowired
    private SocieteService societeService ;

    
    @PostMapping("/")
    public int save(@RequestBody Societe societe) {
		return societeService.save(societe);
	}

	@GetMapping("/myice/{ice}")
    public Societe findByIce(@PathVariable String ice) {
        return societeService.findByIce(ice);
    }

    @DeleteMapping("/myice/{ice}")
    public int deleteByIce(@PathVariable String ice) {
        return societeService.deleteByIce(ice);
    }
    @GetMapping("/mycapital/{capital}")
    public List<Societe> findByCapitalGreaterThan(@PathVariable double capital) {
        return societeService.findByCapitalGreaterThan(capital);
    }
    @GetMapping("/")
    public List<Societe> findAll() {
        return societeService.findAll();
    }
    @GetMapping("/myid/{id}")
    public Societe getOne(@PathVariable Long id) {
        return societeService.getOne(id);
    }
}
