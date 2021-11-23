package zooAnimales;
import gestion.Zona;

public class Pez extends Animal {
	private int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private Pez[] listado;
	public int salmones=0;
	public int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
	}
	public Pez(String nombre, int edad, String habitat, Zona zona, String genero, String colorEscamas, int cantidadAletas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	public int cantidadPeces() {
		
	}
	@Override
	public String movimiento() {
		
	}
	public void crearSalmon() {
		//rojo, 6, oceano
		
	}
	public void crearBacalao() {
		//gris, 6, oceano
		
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
	public Pez[] getPez() {
		return listado;
		
	}
	public void setPez(Pez[] listado) {
		this.listado=listado;
		
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
