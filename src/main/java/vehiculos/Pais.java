package vehiculos;

public class Pais {
	public String nombre;

	public Pais (String pais) {
		this.nombre = pais;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void paisMasVendedor() {
		Fabricante.fabricaMayorVentas().getPais();
		
	}
}
