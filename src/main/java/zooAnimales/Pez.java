package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
		listado.add(this);
		totalAnimales++;
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalAnimales++;
	}
	public static int cantidadPeces() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "nadar";
		
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		//rojo, 6, oceano
		salmones++;
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		return salmon;
		
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		//gris, 6, oceano
		bacalaos++;
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		return bacalao;
		
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
	public static ArrayList<Pez> getPez() {
		return listado;
		
	}
	public static void setPez(ArrayList<Pez> listado) {
		Pez.listado=listado;
		
	}
	public String getColorEscamas() {
		return colorEscamas;
		
	}
	public void setColorEscamas(String color) {
		this.colorEscamas=color;
		
	}
	public int getCantidadAletas() {
		return cantidadAletas;
		
	}
	public void setCantidadAletas(int aletas) {
		this.cantidadAletas=aletas;
		
	}

}
