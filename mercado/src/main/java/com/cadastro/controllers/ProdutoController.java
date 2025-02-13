package com.cadastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.entities.Produto;
import com.cadastro.services.ProdutoService;

@RestController
@RequestMapping("/mercado")

public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto> getAllProduto() {
		return produtoService.getAllProduto();
	}
	
	@GetMapping("/{Id}")
	public Produto getProduto(@PathVariable Long Id) {
		return produtoService.getProdutoById(Id);
	}
	@DeleteMapping("/{id}")
	public void deleteProduto (@PathVariable Long Id) {
		produtoService.deleteService(Id);
	}
}
