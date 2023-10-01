package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	
	private static int cantidadCamiones=0;
	
	//Constructores
	public Camion() {super();Camion.cantidadCamiones++;}
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes=ejes;
		Camion.cantidadCamiones++;
	}
	//Metodos de instancia
	//Metodos de clase
	public static int getCantidadCamiones() {return cantidadCamiones;}
	
	//Metodos set y get
	public void setEjes(int num) {this.ejes=num;}
	public int getEjes() {return this.ejes;}
}
