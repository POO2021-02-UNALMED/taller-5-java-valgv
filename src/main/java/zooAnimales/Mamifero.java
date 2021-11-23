package zooAnimales;
import gestion.Zona;

public class Mamifero extends Animal {
	private int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private Mamifero[] listado; //atributo listado donde se almacena cada objeto al ser creado
	public int caballos=0; //conteo de veces que se uso el m�todo crearCaballo
	public int leones=0; //crearLeon
	private boolean pelaje;
	private int patas;

	public Mamifero() {
	}
	public Mamifero(String nombre, int edad, String habitat, Zona zona, String genero, boolean pelaje, int patas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	public int cantidadMamiferos() {
		//retrona la cantidad demamiferos creados
		return listado.length;
		
	}
	public void crearCaballo() {
		//crea mamifero con pelaje=true, patas=4, habitat=selva
		
	}
	public void crearLeon() {
		//pelaje=true, patas=4, habitat=selva
		
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
	public Mamifero[] getMamifero() {
		return listado;
		
	}
	public void setMamifero(Mamifero[] listado) {
		this.listado=listado;
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
