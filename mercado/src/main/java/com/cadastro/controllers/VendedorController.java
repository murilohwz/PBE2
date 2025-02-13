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

import com.cadastro.entities.Vendedor;
import com.cadastro.services.VendedorService;

@RestController
@RequestMapping("/mercado")

public class VendedorController {

	@Autowired
	private VendedorService vendedorService;
	
	@PostMapping
	public Vendedor createVendedor(@RequestBody Vendedor vendedor) {
		return vendedorService.saveVendedor(vendedor);
	}
	@GetMapping
	public List<Vendedor> getAllVendedor() {
		return vendedorService.getAllVendedor();
	}
	@GetMapping("/{id}")
	public Vendedor getVendedor(@PathVariable Long Id) {
		return vendedorService.getVendedorById(Id);
	}
	@DeleteMapping("/{id}")
	public void deleteVendedor (@PathVariable Long Id) {
		vendedorService.deleteVendedor(Id);
	}
}
