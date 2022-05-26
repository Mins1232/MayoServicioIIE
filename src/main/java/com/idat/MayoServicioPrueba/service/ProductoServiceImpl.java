package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	@Override
	public void guardarProductos(Productos producto) {
		// TODO Auto-generated method stub
		//repository.guardarProductos(producto);
		repository.save(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		//repository.actualizarProducto(producto);
		repository.saveAndFlush(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		//repository.eliminarProducto(id);
		repository.deleteById(id);
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		//return repository.listarProductos();
		return repository.findAll();
	
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		//return repository.obtenerProductoId(id);
		return repository.findById(id).orElse(null);
	}

}
