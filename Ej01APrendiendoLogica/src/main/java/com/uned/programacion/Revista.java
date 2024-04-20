package com.uned.programacion;

public class Revista {
	
	 String nombre;
	 double precio;
	 int cantDisp;
	
	
	public Revista(String nombre, double precio, int cantDisp) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantDisp = cantDisp;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantDisp() {
		return cantDisp;
	}


	public void setCantDisp(int cantDisp) {
		this.cantDisp = cantDisp;
	}


	@Override
	public String toString() {
		return "La revista " + nombre + ", tiene un precio de " + precio + "€ y nos quedan disponibles " + cantDisp + " unidades";
	}
	
	
	
	

}
