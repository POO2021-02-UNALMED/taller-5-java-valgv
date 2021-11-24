package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>(); //atributo listado donde se almacena cada objeto al ser creado
	public int caballos=0; //conteo de veces que se uso el método crearCaballo
	public int leones=0; //crearLeon
	private boolean pelaje;
	private int patas;

	public Mamifero() {
		listado.add(this);
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
	public void crearCaballo() {
		//crea mamifero con pelaje=true, patas=4, habitat=selva
		caballos++;
		Mamifero caballo = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
		
	}
	public void crearLeon() {
		//pelaje=true, patas=4, habitat=selva
		leones++;
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
		
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
	public ArrayList<Mamifero> getMamifero() {
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
