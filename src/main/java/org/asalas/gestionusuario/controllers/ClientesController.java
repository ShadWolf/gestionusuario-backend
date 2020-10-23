package org.asalas.gestionusuario.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asalas.gestionusuario.controllers.models.ClientesRest;
import org.asalas.gestionusuario.entity.Clientes;
import org.asalas.gestionusuario.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/clientes")
public class ClientesController {
	@Autowired
	private ClientesService clienteServ;

	@PostMapping("/crear")
	@ResponseBody public Map<String, String> CrearClientes( @RequestBody ClientesRest cliente ) {
		//buscar cliente en tabla cliente para saber si es nuevo
		 HashMap<String, String> map = new HashMap<>();
		
		
		Clientes cli = new Clientes();
		cli.setNombre(cliente.getNombre());
		cli.setApellido(cliente.getApellido());
		Clientes savedcli = clienteServ.saveOrUpdate(cli);
		if(savedcli != null) {
		    map.put("message",  "Cliente Guardado");
			return map;
		}
		map.put("message", "Se produjo un error al guardar el Cliente");
		return map;
	}
	
	@GetMapping("/listar")
	public List<Clientes> ListarClientes(){
		List<Clientes> cli = clienteServ.listAll();
		//usar clientesRepo para obtener la lista de los clientes.
		return cli;
	}
}
