package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Cliente;
import com.idat.MayoServicioPrueba.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	@Override
	public void guardarClientes(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);
	}

	@Override
	public void actualizarClientes(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);
	}

	@Override
	public void eliminarClientes(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);	}

}
