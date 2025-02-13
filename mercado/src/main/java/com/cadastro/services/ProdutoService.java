package com.cadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.entities.Produto;
import com.cadastro.repositories.ProdutoRepository;

@Service

public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto saveProduto (Produto produto) {
		return produtoRepository.save(produto);
	}
	public List<Produto> getAllProduto() {
		return produtoRepository.findAll();
	}
	public Produto getProdutoById(Long Id) {
		return produtoRepository.findById(Id).orElse(null);
	}
	public void deleteProduto(Long Id) {
		produtoRepository.deleteById(Id);
	}
}
