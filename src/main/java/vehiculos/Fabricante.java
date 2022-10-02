package vehiculos;

public class Fabricante {
	public String nombre;
	public Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}	
	
	public void fabricaMayorVentas() {
		Vehiculo.fabricaMayorVentas();
	}
}
