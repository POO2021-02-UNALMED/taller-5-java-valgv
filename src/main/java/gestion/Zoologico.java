package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public void agregarZonas(Zona zona){
		//agregar nuevas zonas al zoologico
		zonas.add(zona);
		
	}
	public int cantidadTotalAnimales() {
		//cantidad animales de todas las zonas que tengan relacion con el zoologico 
		return zonas.size();	
		
	}
	public ArrayList<Zona> getZona() {
		return zonas;
		
	}
	public void setZona(ArrayList<Zona> zona) {
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
