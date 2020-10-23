package org.asalas.gestionusuario.controllers.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CuentasRest {
	private List<ClientesRest> idCliente;
	private String cuenta;
}
