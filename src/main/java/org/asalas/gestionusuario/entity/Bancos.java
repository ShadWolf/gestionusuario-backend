package org.asalas.gestionusuario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bancos {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nombre;
	
}
