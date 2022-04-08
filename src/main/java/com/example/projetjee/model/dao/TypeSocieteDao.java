package com.example.projetjee.model.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetjee.bean.TypeSociete;


@Repository
public interface TypeSocieteDao extends JpaRepository<TypeSociete,Long> {

    public TypeSociete findByCode(String code);
    public int deleteByCode(String code) ;


}
