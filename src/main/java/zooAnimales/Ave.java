package zooAnimales;
import gestion.Zona;

public class Ave extends Animal {
	private int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	private Ave[] listado;
	public int halcones=0; //numero de veces que se uso crearAlcon
	public int aguilas=0;// crearAguilas
	private String colorPlumas;

	public Ave() {
	}
	public Ave(String nombre, int edad, String habitat, Zona zona, String genero, String colorPlumas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
	}
	public int cantidadAves() {
		//cantidad aves creadas
		return listado.length;
		
	}
	@Override
	public String movimiento() {
		return "volar";
		
	}
	public void crearHalcon() {
		//colorPlumas= cafe glorioso, habitat= montanas
		
	}
	public void crearAguila() {
		//colorPlumas=blanco y amarillo, habitat=montanas
		
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
	public Ave[] getAve() {
		return listado;
		
	}
	public void setAve(Ave[] listado) {
		this.listado=listado;
		
	}
	public String getColorPlumas() {
		return colorPlumas;
		
	}
	public void setColorPlumas(String color) {
		this.colorPlumas=color;
		
	}

}
