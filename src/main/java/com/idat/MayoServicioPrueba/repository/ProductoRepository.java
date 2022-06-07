package com.idat.MayoServicioPrueba.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;
 
@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {

	//1 se ponen las operaciones
	/*void guardarProductos(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos>listarProductos();
	Productos obtenerProductoId(Integer id);
*/
	
}
