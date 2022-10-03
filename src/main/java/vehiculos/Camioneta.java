package vehiculos;

public class Camioneta extends Vehiculo{
	public Boolean volco;
	
	public Camioneta (String placa, Integer puertas, String nombre, Integer precio, Integer peso, Fabricante fabricante, Boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
		CantidadVehiculos++;
	}

	public Boolean isVolco() {
		return volco;
	}

	public void setVolco(Boolean volco) {
		this.volco = volco;
	}
	
	
}
