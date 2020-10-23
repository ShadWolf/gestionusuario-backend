package org.asalas.gestionusuario.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asalas.gestionusuario.controllers.models.ClientesRest;
import org.asalas.gestionusuario.controllers.models.CuentasRest;
import org.asalas.gestionusuario.entity.Clientes;
import org.asalas.gestionusuario.entity.Cuentas;
import org.asalas.gestionusuario.repository.ClientesRepository;
import org.asalas.gestionusuario.repository.CuentasRepository;
import org.asalas.gestionusuario.services.ClientesService;
import org.asalas.gestionusuario.services.CuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/cuentas")
public class CuentasController {

	@Autowired
	private CuentasService cuentasServ;

	@Autowired
	private ClientesService clientesServ;
	
	@PostMapping("/crear")
	public Map<String, String>  CrearCuenta(@RequestBody CuentasRest cuenta) {
		// buscamos si ya existe una cuenta con el id cliente.
		HashMap<String, String> map = new HashMap<>();
		Cuentas cuenta_reg = new Cuentas();

		// recuperar la lista de los Clientes
		List<ClientesRest> listaCliRest = cuenta.getIdCliente();
		List<Clientes> listCliReg = new ArrayList<>();

			// buscar el cliente correspondiente
			for (ClientesRest cli : listaCliRest) {
				Clientes cliReg = clientesServ.getCliente(cli.getNombre(), cli.getApellido());
				if (cliReg != null) {
					listCliReg.add(cliReg);
				}
			}

			cuenta_reg.setIdCliente(listCliReg);
			cuenta_reg.setCuenta(cuenta.getCuenta());
			cuentasServ.saveOrUpdate(cuenta_reg);
			
			map.put("message", "Cuenta Creada Exito");
			return map;
	
	}
	
 
	@GetMapping("/listar")
	public List<Cuentas> ListarCuentas() {
		List<Cuentas> listaCuentas = cuentasServ.listAll();
		return listaCuentas;
	}
}
