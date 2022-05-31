package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Items;

public interface ItemService {
	void guardarItem(Items items);
	void actualizarItem(Items items);
	void eliminarItem(Integer id);
	List<Items>listarItems();
	Items obtenerItemsId(Integer id);

}
