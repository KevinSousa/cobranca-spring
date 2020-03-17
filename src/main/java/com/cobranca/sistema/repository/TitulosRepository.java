package com.cobranca.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cobranca.sistema.model.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long> {

}
