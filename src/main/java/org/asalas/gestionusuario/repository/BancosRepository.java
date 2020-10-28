package org.asalas.gestionusuario.repository;

import org.asalas.gestionusuario.entity.Bancos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancosRepository extends JpaRepository<Bancos, Integer>{

}
