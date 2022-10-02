package vehiculos;

public class Camion extends Vehiculo{
	public Integer ejes;
	
	public Camion (String placa, String nombre, Integer precio, Integer peso, Fabricante fabricante, Integer ejes) {
		puertas = 2;
		velocidadMaxima = 80;
		traccion = "4X2";
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.ejes = ejes;
		cantidadCamiones++;
		CantidadVehiculos++;
		fabricantes.add(fabricante);
	}

	public Integer getEjes() {
		return ejes;
	}

	public void setEjes(Integer ejes) {
		this.ejes = ejes;
	}
	
	
}
