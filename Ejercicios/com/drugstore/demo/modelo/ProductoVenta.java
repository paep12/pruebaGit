package com.drugstore.demo.modelo;
// Generated 15/05/2018 12:39:00 PM by Hibernate Tools 4.0.0

/**
 * ProductoVenta generated by hbm2java
 */
public class ProductoVenta implements java.io.Serializable {

	private int idproductoventa;
	private Venta venta;
	private Producto producto;

	public ProductoVenta() {
	}

	public ProductoVenta(int idproductoventa, Venta venta, Producto producto) {
		this.idproductoventa = idproductoventa;
		this.venta = venta;
		this.producto = producto;
	}

	public int getIdproductoventa() {
		return this.idproductoventa;
	}

	public void setIdproductoventa(int idproductoventa) {
		this.idproductoventa = idproductoventa;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
