package com.idat.MayoServicioPrueba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.model.Proveedor;
import com.idat.MayoServicioPrueba.service.ProveedorService;

@Controller
@RequestMapping("/proveedor/v1")
public class ProveedorController {
	
	@Autowired
	private ProveedorService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Proveedor>> listar(){
		return new ResponseEntity<List<Proveedor>>(service.listarProveedor(), HttpStatus.OK);
	}
	
	@RequestMapping(path ="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Proveedor proveedor){
		service.guardarProveedor(proveedor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path ="/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Proveedor p=service.obtenerProveedorId(id);
		if(p != null) {
			service.eliminarProveedor(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar (@RequestBody Proveedor proveedor){
		Proveedor p = service.obtenerProveedorId(proveedor.getIdProveedor());
		if(p != null) {
			service.actualizarProveedor(proveedor);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	@RequestMapping(path= "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Proveedor> obtenerId(@PathVariable Integer id){
	
	Proveedor p=service.obtenerProveedorId(id);
	if(p != null) {
		
		return new ResponseEntity<Proveedor>(service.obtenerProveedorId(id) ,HttpStatus.OK);
	}
	return new ResponseEntity<Proveedor>(HttpStatus.NOT_FOUND);
}

	
	
}
