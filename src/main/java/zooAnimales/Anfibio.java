package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio() {
		listado.add(this);
		totalAnimales++;
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
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		//rojo, true, selva
		ranas++;
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		return rana;
		
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		//negro y amarillo, false, selva
		salamandras++;
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		return salamandra;
	}
	public static ArrayList<Anfibio> getAnfibio() {
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
