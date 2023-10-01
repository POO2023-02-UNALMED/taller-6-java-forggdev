package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	private static int cantidadVehiculos=0;
	
	//Constructores
	public Vehiculo() {Vehiculo.cantidadVehiculos++;}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		Vehiculo.cantidadVehiculos++;
		this.fabricante.fabricar();
	}
	//Metodos de instancia
	
	//Metodos de clase 
	public static int getCantidadVehiculos() {return cantidadVehiculos;}
	public static void setCantidadVehiculos(int num) {cantidadVehiculos=num;}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: " + Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
	}
	
	//Metodos set y get
	public void setPlaca(String placa) {this.placa=placa;}
	public String getPlaca() {return this.placa;}
	
	public void setPuertas(int num) {this.puertas=num;}
	public int getPuertas() {return this.puertas;}
	
	public void setVelocidadMaxima(int num) {this.velocidadMaxima=num;}
	public int getVelocidadMaxima() {return this.velocidadMaxima;}
	
	public void setNombre(String nombre) {this.nombre=nombre;}
	public String getNombre() {return this.nombre;}
	
	public void setPrecio(int num) {this.precio=num;}
	public int getPrecio() {return this.precio;}
	
	public void setPeso(int num) {this.peso=num;}
	public int getPeso() {return this.peso;}
	
	public void setTraccion(String traccion) {this.traccion=traccion;}
	public String getTraccion() {return this.traccion;}
	
	public void setFabricante(Fabricante fabricante) {this.fabricante=fabricante;}
	public Fabricante getFabricante() {return this.fabricante;}
}
