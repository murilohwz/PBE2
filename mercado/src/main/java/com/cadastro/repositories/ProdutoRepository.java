package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{ 

}


