package zooAnimales;
import gestion.Zona;

public class Anfibio extends Animal {
	private int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private Anfibio[] listado;
	public int ranas=0;
	public int salamandras=0;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio() {
	}
	public Anfibio(String nombre, int edad, String habitat, Zona zona, String genero, String colorPiel, boolean venenoso){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public int cantidadAnfibios() {
		return listado.length;
		
	}
	@Override
	public String movimiento() {
		return "saltar";
		
	}
	public void crearRana() {
		//rojo, true, selva
		
	}
	public void crearSalamandra() {
		//negro y amarillo, false, selva
		
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	public int getEdad() {
		return edad;
		
	}
	public void setEdad(int edad) {
		this.edad=edad;
		
	}
	public String getHabitat() {
		return habitat;
		
	}
	public void setHabitat(String habitat) {
		this.habitat=habitat;
		
	}
	public String getGenero() {
		return genero;
		
	}
	public void setGenero(String genero) {
		this.genero=genero;
		
	}
	public Zona getZona() {
		return zona;
		
	}
	public void setZona(Zona zona) {
		this.zona=zona;
		
	}
	public Anfibio[] getAnfibio() {
		return listado;
		
	}
	public void setAnfibio(Anfibio[] listado) {
		this.listado=listado;
		
	}
	public String getColorPiel() {
		return colorPiel;
		
	}
	public void setColorPiel(String color) {
		this.colorPiel=color;
		
	}
	public boolean getVenenoso() {
		return venenoso;
		
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
		
	}
}
