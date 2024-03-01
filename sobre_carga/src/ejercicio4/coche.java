package ejercicio4;

import javax.swing.JOptionPane;

public class coche {

	//ATRIBUTOS PARA REPRESENTAR LOS DOS COCHES
	private String modelo1;
	private String modelo2;
	private String color1;
	private String color2;
	private int año1;
	private int año2;
	
	public coche(String marca) {
		this.marca=marca;
		if(marca.equalsIgnoreCase("seat")) {
			modelo1 = "LEON";
			modelo2 = "IBIZA";
			color1 = "blanco";
			color2 = "gris";
			año1 = 2007;
			año2 = 2010;
		}else {
			modelo1 = "C3";
			modelo2 = "C5";
			color1 = "rojo";
			color2 = "negro";
			año1 = 2015;
			año2 = 2016;
		}
	}
	public coche(String marca,String modelo) {
		this.marca=marca;
		if(marca.equalsIgnoreCase("seat")) {
			if (modelo.equalsIgnoreCase("leon")) {
				this.modelo = "LEON";
				color = "blanco";
				año = 2007;
			}else {
				this.modelo = "IBIZA";
				color = "gris";
				año = 2010;
			}
		}else {
			if (modelo.equalsIgnoreCase("C3")) {
				this.modelo = "C3";
				color = "rojo";
				año = 2015;
			}else {
				this.modelo = "C5";
				color = "negro";
				año = 2016;
			}
		}
	}
	
	public void datosGeneralesCoche() {
		JOptionPane.showMessageDialog(null, "Marca :"+marca+"\nModelos disponibles: "+modelo1+" / "+modelo2+"\n"
				+"Colores disponibles: "+color1+" / "+color2+"\n"
				+"Años de fabricacion: "+año1+" - "+año2);
	}
	public void datosEspecificosCoche() {
		
		JOptionPane.showMessageDialog(null, "Marca y Modelo: "+marca+" "+modelo+"\n"
				+"Color: "+color+"\nAño: "+año);	
		
	}
	//ATRIBUTOS PARA REPRESENTAR EL COCHE DE LA MARCA QUE EL USUARIO QUIERA
	private String marca;
	private String modelo;
	private String color;
	private int año;
}
