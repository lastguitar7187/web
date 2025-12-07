package com.example.demo.model;



public class Pract3Model 
{
	
	private String clave;
	private String nombre;
	private double precio;
	private int existencia;
	
	public Pract3Model(String clave, String nombre,double precio,int existencia) {
		this.nombre=nombre;
		this.clave=clave;
		this.existencia=existencia;
		this.precio=precio;
	}
	 
	 public String getNombre() { return nombre; }
	 public void setNombre(String nombre) { this.nombre = nombre; }
	 
	 public String getClave() {return clave;}
	 public void setClave(String clave) {this.clave=clave;}
	 
	 public double getPrecio() {return precio;}
	 public void setPrecio(double precio) {this.precio=precio;}
	 
	 public int getExistencia() { return existencia; }
	 public void setExistencia(int existencia) {this.existencia=existencia;}
	 
	 
	 
}
