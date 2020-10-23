package org.asalas.gestionusuario.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Cuentas {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany
	@JoinColumn(name = "Clientes", referencedColumnName= "Id" )
	private List<Clientes> idCliente= new ArrayList<>();
	
	@Column(length=200)
	private String cuenta;

}
