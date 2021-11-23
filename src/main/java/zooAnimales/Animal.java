package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;

public class Animal{
	private int totalAnimales = 0; //conteo total de animales 
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal() {
	}
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.zona = zona;
		this.genero = genero;
	}
	public String movimiento() {
		/*retorna el valor del como el animal se mueve,
		 * Animal=desplazarse
		 * Ave=volar
		 * REptil=reptar
		 * Pez=nadar
		 * Anfibio=saltar
		 */
		return "desplazarse";
	}
	public int totalPorTipo() {
		/* "Mamiferos:#
		 * Aves:#
		 * Reptiles:#
		 * Peces:#
		 * Anfibios:#
		 */
				
		
	}
	public String toString() {
		/* Mi nombre es #nombre, tengo una edad de #edad, habito en #habitat y mi genero es #genero,
		 * la zona en la que me ubico es #zona, en el #zoo"
		 * Los valores de zoo y zona son los valores del nombre del respectivo objeto,
		 * si no tiene zona solo se impirme hasta el género
		 */
		return "Mi nombre es "+ nombre +", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona+", en el ";
				//Los valores de zoo y zona son los valores del nombre del respectivo objeto,si no tiene zona solo se impirme hasta el género"
		
	}
	public int getTotalAnimales() {
		
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

}
