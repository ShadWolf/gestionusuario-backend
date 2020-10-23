package org.asalas.gestionusuario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Clientes {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;

}
