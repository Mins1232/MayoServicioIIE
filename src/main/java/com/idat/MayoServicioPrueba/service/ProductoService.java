package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.dto.ProductoDTORequest;
import com.idat.MayoServicioPrueba.dto.ProductoDTOResponse;
import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {
	void guardarProductos(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse>listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);
}
