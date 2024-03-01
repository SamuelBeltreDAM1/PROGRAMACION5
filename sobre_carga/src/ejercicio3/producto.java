package ejercicio3;

import javax.swing.JOptionPane;

public class producto {
private String nombre;
private String tipo;
private static double precio1;
private double precio2;
private int cantidad1;
private int cantidad2;
private int cantidadT;


public producto(String nombre) {
	this.nombre=nombre;
	if (nombre.equalsIgnoreCase("mesas")) {
		precio1 = 20;
		precio2 = 25;
		cantidad1 = 30;
		cantidad2 = 32;
		cantidadT = cantidad1+cantidad2;
	}else if (nombre.equalsIgnoreCase("sillas")) {
		precio1 = 5;
		precio2 = 10;
		cantidad1 = 40;
		cantidad2 = 50;
		cantidadT = cantidad1+cantidad2;
	}else {
		precio1 = 40;
		precio2 = 45;
		cantidad1 = 10;
		cantidad2 = 10;
		cantidadT = cantidad1+cantidad2;
	}
	
}
public producto(String nombre, String tipo) {
	this.nombre=nombre;
	this.tipo=tipo;
	if (nombre.equalsIgnoreCase("mesas")) {
		if (tipo.equalsIgnoreCase("madera")) {
			precio1 = 20;
			cantidad1 = 30;
		}else {
			precio2 = 25;
			cantidad2 = 32;
		}
	}else if (nombre.equalsIgnoreCase("sillas")) {
		if (tipo.equalsIgnoreCase("madera")) {
			precio1 = 5;
			cantidad1 = 40;
		}else {
			precio2 = 10;
			cantidad2 = 50;
		}
	}else {
		if (tipo.equalsIgnoreCase("madera")) {
			precio1 = 40;
			cantidad1 = 10;
		}else {
			precio2 = 55;
			cantidad2 = 1;
		}
	}
}
public void mostrarDatos() {
	JOptionPane.showMessageDialog(null, "NOMBRE DEL PRODUCTO: "+nombre+"\n"
			+ "PRECIO " +nombre+ " de madera: "+precio1+" euros ("+cantidad1+")\n"+"PRECIO " +nombre+ " de cristal: "+ precio2+" euros ("+cantidad2+")"
			+ "\nCANTIDAD TOTAL: "+cantidadT);
}
public void mostrarDatosTipo() {
	if(tipo.equalsIgnoreCase("madera")) {
		JOptionPane.showMessageDialog(null, "NOMBRE DEL PRODUCTO: "+nombre+"\n"
				+ "PRECIO " +nombre+ " de madera: "+precio1+" euros ("+cantidad1+")\n");
	}else {
		JOptionPane.showMessageDialog(null, "NOMBRE DEL PRODUCTO: "+nombre+"\n"
				+ "PRECIO " +nombre+ " de cristal: "+precio2+" euros ("+cantidad2+")\n");
	}
}
}
