package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones=0;
	public int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
		listado.add(this);
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
	public void crearSalmon() {
		//rojo, 6, oceano
		salmones++;
		Pez pez = new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
		
	}
	public void crearBacalao() {
		//gris, 6, oceano
		bacalaos++;
		Pez pez = new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
		
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
	public ArrayList<Pez> getPez() {
		return listado;
		
	}
	public void setPez(ArrayList<Pez> listado) {
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
