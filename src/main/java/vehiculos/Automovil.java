package vehiculos;

public class Automovil extends Vehiculo{
	public Integer puestos;
	
	public Automovil() {
		puertas = 4;
		velocidadMaxima = 100;
		traccion = "FWD";
	}
	
	public Automovil(String placa, String nombre, Integer precio, Integer peso, Fabricante fabricante, Integer puestos) {
		puertas = 4;
		velocidadMaxima = 100;
		traccion = "FWD";
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puestos = puestos;
		cantidadAutomoviles++;
		CantidadVehiculos++;
		fabricantes.add(fabricante);
	}

	public Integer getPuestos() {
		return puestos;
	}

	public void setPuestos(Integer puestos) {
		this.puestos = puestos;
	}
	
	
}
