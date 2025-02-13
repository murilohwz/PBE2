package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	
}
