package vehiculo;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int cantidadVendidos=0;
	
	//Lista de paises
	private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	
	//Constructores
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	
	//Metodos de instancia
	//Metodos de clase
	public Pais paisMasVendedor() {
		Pais mayorPais = listaPaises.get(0);
		for (Pais pais : listaPaises) {
			if (pais.getCantidadVendidos()>mayorPais.getCantidadVendidos()) {
				mayorPais = pais;
			}
		}
		return mayorPais;
	}
	
	//Metodos get y set
	public void setNombre(String nombre) {this.nombre=nombre;}
	public String getNombre() {return this.nombre;}
	
	public void setCantidadVendidos(int num) {this.cantidadVendidos=num;}
	public int getCantidadVendidos() {return this.cantidadVendidos;}
}
