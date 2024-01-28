package com.thiago.ligaapp.api.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.ligaapp.api.br.model.Liga;

@Repository
public interface LigaRepository extends JpaRepository<Liga, Long> {

}
