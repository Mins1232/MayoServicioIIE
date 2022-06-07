package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Cliente;

public interface ClienteService {
	void guardarClientes(Cliente cliente);
	void actualizarClientes(Cliente cliente);
	void eliminarClientes(Integer id);
	List<Cliente>listarClientes();
	Cliente obtenerClienteId(Integer id);
	
	
}
