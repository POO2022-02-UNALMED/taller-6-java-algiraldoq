package vehiculos;

public class Camion extends Vehiculo{
	public Integer ejes;
	
	public Camion (String placa, String nombre, Integer precio, Integer peso, Fabricante fabricante, Integer ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
		CantidadVehiculos++;
	}

	public Integer getEjes() {
		return ejes;
	}

	public void setEjes(Integer ejes) {
		this.ejes = ejes;
	}
	
	
}
