package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadFabricados=0;
	
	//Lista de fabricantes
	private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
	
	//Constructores
	public Fabricante() {}
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		listaFabricantes.add(this);
	}
	//Metodos de instancia
	public void fabricar() {this.cantidadFabricados++; this.pais.setCantidadVendidos(this.pais.getCantidadVendidos()+1);}
	//Metodos de clase
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayorFabricante = listaFabricantes.get(0);
		for (Fabricante fabri : listaFabricantes) {
			if (fabri.getCantidadFabricados()>mayorFabricante.getCantidadFabricados()) {
				mayorFabricante = fabri;
			}
		}
		return mayorFabricante;
	}
	
	
	//Metodos set y get
	public void setNombre(String nombre) {this.nombre=nombre;}
	public String getNombre() {return this.nombre;}
	
	public void setPais(Pais pais) {this.pais=pais;}
	public Pais getPais() {return this.pais;}
	
	public void setCantidadFabricados(int num) {this.cantidadFabricados=num;}
	public int getCantidadFabricados() {return this.cantidadFabricados;}
}
