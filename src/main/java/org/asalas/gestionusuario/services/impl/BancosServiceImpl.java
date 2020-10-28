package org.asalas.gestionusuario.services.impl;

import org.asalas.gestionusuario.entity.Bancos;
import org.asalas.gestionusuario.repository.BancosRepository;
import org.asalas.gestionusuario.services.BancosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BancosServiceImpl implements BancosService {
	@Autowired
	private BancosRepository bancoRep;
	
	@Override
	public void save(Bancos banco) {
		bancoRep.saveAndFlush(banco);
	}
}	
