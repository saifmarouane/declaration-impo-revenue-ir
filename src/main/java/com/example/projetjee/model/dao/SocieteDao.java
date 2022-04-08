package com.example.projetjee.model.dao;


import com.example.projetjee.bean.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface SocieteDao extends JpaRepository<Societe,Long> {
    public Societe findByIce(String ice) ;
    public int deleteByIce(String ice) ;
    public List<Societe> findByCapitalGreaterThan(double capital) ;

}
