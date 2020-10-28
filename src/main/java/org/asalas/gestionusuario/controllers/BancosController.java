package org.asalas.gestionusuario.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asalas.gestionusuario.entity.Bancos;
import org.asalas.gestionusuario.entity.BancosCuentas;
import org.asalas.gestionusuario.entity.Clientes;
import org.asalas.gestionusuario.entity.Cuentas;
import org.asalas.gestionusuario.services.BancosCuentasService;
import org.asalas.gestionusuario.services.BancosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bancos")
public class BancosController {
	@Autowired
	BancosCuentasService bcService;
	
	@GetMapping("/crearbancotest")
	public Map<String, String> getCrearBancoTest(){
		HashMap<String, String> result = new HashMap<>();
		
		Clientes cli =  new Clientes();
		cli.setNombre("alan");
		cli.setApellido("Sandoval");
		
		List<Clientes> listaCli = new ArrayList <>();
		listaCli.add(cli);
		
		Bancos bancos = new Bancos();
		bancos.setNombre("BBCI");
		Cuentas cuenta = new Cuentas();
		cuenta.setCuenta("121323");
		cuenta.setIdCliente(listaCli);
		
		BancosCuentas  bc = new BancosCuentas();
		bc.setBanco(bancos);
		bc.setCuenta(cuenta);
		
		bcService.save(bc);;
		
		result.put("message", "Banco test creado");
		return result;
	}
	
}
