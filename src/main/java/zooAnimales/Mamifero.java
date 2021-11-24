package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>(); //atributo listado donde se almacena cada objeto al ser creado
	public static int caballos; //conteo de veces que se uso el método crearCaballo
	public static int leones; //crearLeon
	private boolean pelaje;
	private int patas;

	public Mamifero() {
		listado.add(this);
		totalAnimales++;
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
		totalAnimales++;
	}
	public static int cantidadMamiferos() {
		//retrona la cantidad demamiferos creados
		return listado.size();
		
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		//crea mamifero con pelaje=true, patas=4, habitat=selva
		caballos++;
		Mamifero caballo = new Mamifero(nombre, edad, "selva", genero, true, 4);
		return caballo;
		
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		//pelaje=true, patas=4, habitat=selva
		leones++;
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		return leon;
		
	}	
	public static ArrayList<Mamifero> getMamifero() {
		return listado;
		
	}
	public static void setMamifero(ArrayList<Mamifero> listado) {
		Mamifero.listado=listado;
	}
	public boolean getPelaje() {
		return pelaje;
		
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
		
	}
	public int getPatas() {
		return patas;
		
	}
	public void setPatas(int patas) {
		this.patas=patas;
		
	}

}
