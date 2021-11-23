package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private ArrayList<Anfibio> listado;
	public int ranas=0;
	public int salamandras=0;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio() {
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		totalAnimales++;
		
	}
	public int cantidadAnfibios() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "saltar";
		
	}
	public void crearRana(String nombre, int edad, String genero) {
		//rojo, true, selva
		ranas++;
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
		
	}
	public void crearSalamandra(String nombre, int edad, String genero) {
		//negro y amarillo, false, selva
		salamandras++;
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
		
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
	public ArrayList<Anfibio> getAnfibio() {
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
