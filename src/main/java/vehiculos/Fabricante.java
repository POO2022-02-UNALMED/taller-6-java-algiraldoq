package vehiculos;

import java.util.ArrayList;
import java.util.*;

public class Fabricante {
	public String nombre;
	public Pais pais;
	public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
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
	
	public static Fabricante fabricaMayorVentas() {	
		Fabricante fabricanteMayorVentas = null;
		Integer mayorventas = 0;
		
		for (Fabricante i:fabricantes) {
			Integer ventas = Collections.frequency(fabricantes, i);
			if (ventas > mayorventas) {
				mayorventas = ventas;
				fabricanteMayorVentas = i;
			}
		}
		return fabricanteMayorVentas;
	}
}
