package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones; //numero de veces que se uso crearAlcon
	public static int aguilas;// crearAguilas
	private String colorPlumas;

	public Ave() {
		listado.add(this);
		totalAnimales++;
		
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
		totalAnimales++;
	}
	public static int cantidadAves() {
		//cantidad aves creadas
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "volar";
		
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		//colorPlumas= cafe glorioso, habitat= montanas
		halcones++;
		Ave halcon = new Ave(nombre, edad, "montanas",  genero, "cafe glorioso");
		return halcon;
		
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		//colorPlumas=blanco y amarillo, habitat=montanas
		aguilas++;
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		return aguila;
		
	}
	public static ArrayList<Ave> getAve() {
		return listado;
		
	}
	public static void setAve(ArrayList<Ave> listado) {
		Ave.listado=listado;
		
	}
	public String getColorPlumas() {
		return colorPlumas;
		
	}
	public void setColorPlumas(String color) {
		this.colorPlumas=color;
		
	}

}
