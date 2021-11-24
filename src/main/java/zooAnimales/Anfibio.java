package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		totalAnimales++;
		
	}
	public static int cantidadAnfibios() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "saltar";
		
	}
	public void crearRana(String nombre, int edad, String genero) {
		//rojo, true, selva
		ranas++;
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		
	}
	public void crearSalamandra(String nombre, int edad, String genero) {
		//negro y amarillo, false, selva
		salamandras++;
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
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
	public ArrayList<Anfibio> getAnfibio() {
		return listado;
		
	}
	public static void setAnfibio(ArrayList<Anfibio> listado) {
		Anfibio.listado=listado;
		
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
