package org.asalas.gestionusuario.repository;

import org.asalas.gestionusuario.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

	@Query(
	value = "SELECT * FROM CLIENTES C WHERE LOWER(c.Nombre) = LOWER(:nombre) AND LOWER(c.Apellido) = LOWER(:apellido)",
	nativeQuery = true)
	public Clientes findByNombreApellido(@Param("nombre") String nombre, @Param("apellido")String apellido) ;
}
