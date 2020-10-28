package org.asalas.gestionusuario.services;

import org.asalas.gestionusuario.entity.Bancos;
import org.springframework.stereotype.Service;

@Service
public interface BancosService {
	void save(Bancos banco);
}
