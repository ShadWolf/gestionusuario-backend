package org.asalas.gestionusuario.services;

import java.util.List;

import org.asalas.gestionusuario.entity.Clientes;
import org.springframework.stereotype.Service;

@Service
public interface ClientesService {
	Clientes saveOrUpdate(Clientes cliente);
	Clientes getCliente(String nombre, String apellido);
	List<Clientes> listAll();
}
