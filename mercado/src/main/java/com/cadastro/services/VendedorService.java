package com.cadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.entities.Vendedor;
import com.cadastro.repositories.VendedorRepository;

@Service

public class VendedorService {

	@Autowired
	private VendedorRepository vendedorRepository;
	
	public Vendedor saveVendedor(Vendedor vendedor ) {
		return vendedorRepository.save(vendedor);
	}
	
	public List<Vendedor> getAllVendedor() {
		return vendedorRepository.findAll();
	}
	
	public Vendedor getVendedorById(Long Id ) {
		return vendedorRepository.findById(Id).orElse(null);
	}
	public void deleteVendedor(Long id) {
		vendedorRepository.deleteById(id);
	}
	
}
