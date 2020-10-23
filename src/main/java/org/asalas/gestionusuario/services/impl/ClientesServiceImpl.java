package org.asalas.gestionusuario.services.impl;

import java.util.List;

import org.asalas.gestionusuario.entity.Clientes;
import org.asalas.gestionusuario.repository.ClientesRepository;
import org.asalas.gestionusuario.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesService {
	@Autowired
	private ClientesRepository clienteRepo;
	
	@Override
	public Clientes saveOrUpdate(Clientes cliente) {
		Clientes cli = clienteRepo.saveAndFlush(cliente);
		return cli;
	}
	
	@Override
	public Clientes getCliente(String nombre, String apellido) {
		return clienteRepo.findByNombreApellido(nombre, apellido);
	}
	
	@Override
	public List<Clientes> listAll(){
		return clienteRepo.findAll();
	}
}
