package ejercicio5;

import javax.swing.JOptionPane;

public class estudiantes {

	private String nombre;
	private int edad;
	private static double promedio; 
	private String fin;
	
	
	public estudiantes(String nombre, int edad) {
		this(nombre,edad,promedio);
		this.nombre = nombre;
		this.edad=edad;
		promedio = 0;
		fin = "No finalizado";
		
	}
	public estudiantes(String nombre, int edad, double promedio) {
		this.nombre=nombre;
		this.edad=edad;
		estudiantes.promedio=promedio;
		fin = "Finalizado";
	}
	
	public void mostrarDatos() {
		JOptionPane.showMessageDialog(null, "NOMBRE DEL ESTUDIANTE: "+nombre+"\n"
	+"EDAD DEL ESTUDIANTE: "+ edad+"\nESTADO DEL CURSO: "+fin+"\n"+"PROMEDIO: "+promedio);
	}
	
}
