package ejercicio2;

public class rectangulo {

	private double altura;
	private double ancho;
	
	public rectangulo(int altura, int ancho) {
		this.altura=(int)altura;
		this.ancho=(int)ancho;
	}
	public rectangulo(double altura, double ancho) {
		this.altura=altura;
		this.ancho=ancho;
	}
	
	public void mostrarDatos() {
		System.out.println("DATOS DEL RECTANGULO\n"+
				"ALTURA:" +altura+"\nANCHO: "+ancho+"\nAREA: "+altura*ancho);
	}
}
