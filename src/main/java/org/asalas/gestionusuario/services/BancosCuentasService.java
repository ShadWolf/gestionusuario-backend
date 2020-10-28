package org.asalas.gestionusuario.services;

import org.asalas.gestionusuario.entity.BancosCuentas;
import org.springframework.stereotype.Service;

@Service
public interface BancosCuentasService {

	public void save(BancosCuentas bancocuenta);
}
