package vehiculo;

public class Camioneta extends Vehiculo{
	private boolean volco;
	
	private static int cantidadCamionetas=0;
	
	//Constructores
	public Camioneta() {super();Camioneta.cantidadCamionetas++;}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco=volco;
		Camioneta.cantidadCamionetas++;
	}
	//Metodos de instancia
	//Metodos de clase
	public static int getCantidadCamionetas() {return cantidadCamionetas;}
	
	//Metodos set y get
	public void setVolco(boolean value) {this.volco=value;}
	public boolean isVolco() {return this.volco;}
}
