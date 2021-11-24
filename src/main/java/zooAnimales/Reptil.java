package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas=0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;

	public Reptil() {
		listado.add(this);
		totalAnimales++;
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		totalAnimales++;
	}
	public static int cantidadReptiles() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "reptar";
		
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		//escamas=verde, largo=3, habitat=humedal
		iguanas++;
		Reptil iguana = new Reptil(nombre, edad, "humedal",  genero, "verde", 3);
		return iguana;
		
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		//escamas=blanco, cola=1, habitat=jungla
		serpientes++;
		Reptil serpiente = new Reptil(nombre, edad, "jungla",  genero, "blanco", 1);
		return serpiente;
		
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
	public static ArrayList<Reptil> getReptil() {
		return listado;
		
	}
	public static void setReptil(ArrayList<Reptil> listado) {
		Reptil.listado=listado;
		
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
