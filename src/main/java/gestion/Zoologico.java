package gestion;

import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona zonas;
	
	public Zoologico() {
	}
	public Zoologico(String nombre, String ubicacion, Zona zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	public void agregarZonas(Zona zona){
		//agregar nuevas zonas al zoologico
		
	}
	public int cantidadTotalAnimales() {
		//cantidad animales de todas las zonas que tengan relacion con el zoologico 
		return zonas.cantidadAnimales();	
		
	}
	public Zona getZona() {
		return zonas;
		
	}
	public void setZona(Zona zona) {
		this.zonas=zona;
		
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	public String getUbicacion() {
		return ubicacion;
		
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}

}
