package org.asalas.gestionusuario.services.impl;

import java.util.List;
import  org.asalas.gestionusuario.services.CuentasService;
import org.asalas.gestionusuario.entity.Cuentas;
import org.asalas.gestionusuario.repository.CuentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentasServiceImpl implements CuentasService {
	@Autowired
	private CuentasRepository cuentaRepo;
	
	@Override
	public void saveOrUpdate(Cuentas cuenta) {
		cuentaRepo.save(cuenta);
	}
	
	@Override
	public List<Cuentas> listAll(){
		return cuentaRepo.findAll();
	}
}
