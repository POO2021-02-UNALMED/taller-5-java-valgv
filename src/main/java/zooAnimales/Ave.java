package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones=0; //numero de veces que se uso crearAlcon
	public int aguilas=0;// crearAguilas
	private String colorPlumas;

	public Ave() {
		listado.add(this);
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
	public void crearHalcon() {
		//colorPlumas= cafe glorioso, habitat= montanas
		halcones++;
		Ave halcon = new Ave(nombre, edad, "montanas",  genero, zona, "cafe glorioso");
		
	}
	public void crearAguila() {
		//colorPlumas=blanco y amarillo, habitat=montanas
		aguilas++;
		Ave aguila = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		
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
	public ArrayList<Ave> getAve() {
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
