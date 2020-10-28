package org.asalas.gestionusuario.repository;


import org.asalas.gestionusuario.entity.BancosCuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancosCuentasRepository extends JpaRepository<BancosCuentas, Integer>{

}