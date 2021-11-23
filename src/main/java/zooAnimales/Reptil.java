package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Reptil extends Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private ArrayList<Reptil> listado;
	public int iguanas=0;
	public int serpientes=0;
	private String colorEscamas;
	private int largoCola;

	public Reptil() {
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		totalAnimales++;
	}
	public int cantidadReptiles() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "reptar";
		
	}
	public void crearIguana() {
		//escamas=verde, largo=3, habitat=humedal
		iguanas++;
		Reptil iguana = new Reptil(nombre, edad, "humedal",  genero, zona, "verde", 3);
		
	}
	public void crearSerpiente() {
		//escamas=blanco, cola=1, habitat=jungla
		serpientes++;
		Reptil serpiente = new Reptil(nombre, edad, "jungla",  genero, zona, "blanco", 1);
		
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
	public ArrayList<Reptil> getReptil() {
		return listado;
		
	}
	public void setReptil(ArrayList<Reptil> listado) {
		this.listado=listado;
		
	}
	public String getColorEscamas() {
		return colorEscamas;
		
	}
	public void setColorEscamas(String color) {
		this.colorEscamas=color;
		
	}
	public int getLargoCola() {
		return largoCola;
		
	}
	public void setLargoCola(int largo) {
		this.largoCola=largo;
		
	}
}
