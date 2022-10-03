package vehiculos;

public class Automovil extends Vehiculo{
	public Integer puestos;
	
	public Automovil(String placa, String nombre, Integer precio, Integer peso, Fabricante fabricante, Integer puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomoviles++;
		CantidadVehiculos++;
	}

	public Integer getPuestos() {
		return puestos;
	}

	public void setPuestos(Integer puestos) {
		this.puestos = puestos;
	}
	
	
}
