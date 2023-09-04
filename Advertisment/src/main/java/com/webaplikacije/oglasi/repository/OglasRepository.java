package com.webaplikacije.oglasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webaplikacije.oglasi.model.Oglas;

@Repository
public interface OglasRepository extends JpaRepository<Oglas, Long>{

}
