package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	
	private static int cantidadAutomoviles=0;
	
	//Constructores
	public Automovil() {super();Automovil.cantidadAutomoviles++;}
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		Automovil.cantidadAutomoviles++;
	}
	//Metodos de instancia
	//Metodos de clase
	public static int getCantidadAutomoviles() {return cantidadAutomoviles;}
	
	//Metodos set y get
	public void setPuestos(int num) {this.puestos=num;}
	public int getPuestos() {return this.puestos;}
}
