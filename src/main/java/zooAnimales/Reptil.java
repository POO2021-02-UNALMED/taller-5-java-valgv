package zooAnimales;
import gestion.Zona;

public class Reptil extends Animal {
	private int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private Reptil[] listado;
	public int iguanas=0;
	public int serpientes=0;
	private String colorEscamas;
	private int largoCola;

	public Reptil() {
	}
	public Reptil(String nombre, int edad, String habitat, Zona zona, String genero, String colorEscamas, int largoCola){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public int cantidadReptiles() {
		return listado.length;
		
	}
	@Override
	public String movimiento() {
		return "reptar";
		
	}
	public void crearIguana() {
		//escamas=verde, largo=3, habitat=humedal
		
	}
	public void crearSerpiente() {
		//escamas=blanco, cola=1, habitat=jungla
		
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
	public Reptil[] getReptil() {
		return listado;
		
	}
	public void setReptil(Reptil[] listado) {
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
