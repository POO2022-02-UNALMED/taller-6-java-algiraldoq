package vehiculos;

public class Camioneta extends Vehiculo{
	public Boolean volco;
	
	public Camioneta (String placa,Integer puertas, String nombre, Integer precio, Integer peso, Fabricante fabricante, Boolean volco) {
		velocidadMaxima = 90;
		traccion = "4X4";
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
		cantidadCamionetas++;
		CantidadVehiculos++;
		fabricantes.add(fabricante);
	}

	public Boolean isVolco() {
		return volco;
	}

	public void setVolco(Boolean volco) {
		this.volco = volco;
	}
	
	
}
