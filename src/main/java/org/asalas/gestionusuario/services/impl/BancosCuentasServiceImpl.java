package org.asalas.gestionusuario.services.impl;

import org.asalas.gestionusuario.entity.BancosCuentas;
import org.asalas.gestionusuario.repository.BancosCuentasRepository;
import org.asalas.gestionusuario.services.BancosCuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BancosCuentasServiceImpl implements BancosCuentasService  {

	@Autowired
	private BancosCuentasRepository bcRepo;
	
	@Override
	public void save(BancosCuentas bancocuenta) {
		bcRepo.saveAndFlush(bancocuenta);
	}
}
