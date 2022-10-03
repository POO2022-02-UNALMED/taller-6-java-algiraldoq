package vehiculos;

public class Vehiculo {
	public String placa;
	public Integer puertas;
	public Integer velocidadMaxima;
	public String nombre;
	public Integer precio;
	public Integer peso;
	public String traccion;
	public Fabricante fabricante;
	public Integer CantidadVehiculos;
	public Integer cantidadAutomoviles;
	public Integer cantidadCamionetas;
	public Integer cantidadCamiones;
	
	public Vehiculo (String placa, Integer puertas, Integer velocidadmaxima, String nombre, Integer precio, Integer peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadmaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Fabricante.fabricantes.add(fabricante);
		setCantidadVehiculos();
	}
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public void setCantidadVehiculos() {
		CantidadVehiculos++;
	}

	public String vehiculosPorTipos() {
		return "Automoviles: " + cantidadAutomoviles + "\n" + "Camionetas: " + cantidadCamionetas + "\n" + "Camiones: "
				+ cantidadCamiones;
	}
	
//	public String paisMasVendedor () {
//		Integer mayor = 0;
//		String paisMasVendedor = null;
//		
//		for (int i = 0; i < fabricantes.size(); i++){
//			int f = Collections.frequency(fabricantes, fabricantes.get(i).getPais());
//			
//			if (mayor < f) {
//				mayor = f;
//				paisMasVendedor = fabricantes.get(i).getPais().getNombre();
//			}
//		}
//		return paisMasVendedor;
//	}
//	
//	public String fabricaMayorVentas () {
//		Integer mayor = 0;
//		String fabricanteMayor = null;
//		
//		for (int i = 0; i < fabricantes.size(); i++){
//			int f = Collections.frequency(fabricantes, fabricantes.get(i));
//			
//			if (mayor < f) {
//				mayor = f;
//				fabricanteMayor = fabricantes.get(i).getNombre();
//			}
//		}
//		return fabricanteMayor;
//	}
}
