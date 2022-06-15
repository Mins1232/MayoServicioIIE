package com.idat.MayoServicioPrueba.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Proveedores")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProveedor;
	private String proveedor;
	private String direccion;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_producto",
		nullable=false,
		unique=true,
		foreignKey=@ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references productos(id_producto)")
	)
	//este es el campo que se relaciona con el mapped
	private Productos producto;
	
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Productos getProducto() {
		return producto;
	}
	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idProveedor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proveedor other = (Proveedor) obj;
		return Objects.equals(idProveedor, other.idProveedor);
	}
	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + "]";
	}
	
	
}
