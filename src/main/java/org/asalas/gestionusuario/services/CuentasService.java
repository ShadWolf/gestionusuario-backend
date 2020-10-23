package org.asalas.gestionusuario.services;

import java.util.List;

import org.asalas.gestionusuario.entity.Cuentas;
import org.springframework.stereotype.Service;

@Service
public interface CuentasService {
	void saveOrUpdate(Cuentas cuenta);
	
	List<Cuentas> listAll();

}
