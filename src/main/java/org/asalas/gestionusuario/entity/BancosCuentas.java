package org.asalas.gestionusuario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BancosCuentas {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	@OneToOne(name = "Cuentas")
	private Cuentas cuenta;
	
	@Column
	@OneToOne(name ="Banco")
	private Bancos banco;
	
}
