package org.asalas.gestionusuario.repository;

import org.asalas.gestionusuario.entity.Cuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentasRepository  extends JpaRepository <Cuentas, Integer> {

}
