package gestion;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zona() {
	}
	public Zona(String nombre, Zoologico zoo, Animal[] animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	public void agregarAnimales(Animal animal) {
		//añadira un nuevo animal al listado de animales
		
	}
	public int cantidadAnimales() {
		//retornara la cantidad de animales en la zona
		return animales.length;
	
	}
	public Zoologico getZoologico() {
		return zoo;
		
	}
	public void setZoologico(Zoologico zoo) {
		this.zoo = zoo;
		
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public Animal getAnimal(Animal animal) {
		return animales.animal;
		
	}
	public void setAnimal(Animal[] animal) {
		this.animales = animal;
	}

}
