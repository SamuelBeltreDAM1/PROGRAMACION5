package ejercicio5;

import javax.swing.JOptionPane;

public class uso_estudiantes {
	
	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		estudiantes alumno;
		double promedio;

			String nombre = JOptionPane.showInputDialog("Nombre");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
			validadorEdad(edad);
			int op = Integer
					.parseInt(JOptionPane.showInputDialog("Curso finalizado (PULSE 1)\nCurso no finalizado (PULSE 2)"));
			if (op == 1) {
				promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio obtenido"));
				validadorPromedio(promedio);
				alumno = new estudiantes(nombre, edad, promedio);
				alumno.mostrarDatos();
			} else if (op == 2) {
				alumno = new estudiantes(nombre, edad);
				alumno.mostrarDatos();
			} else {
				JOptionPane.showMessageDialog(null, "Con este numero no se puede operar");
			}
		}
	

	public static void validadorEdad(int edad) {
		if (edad < 0) {
			JOptionPane.showMessageDialog(null, "Edades negativas no existen");
			inicio();
		} else if (edad >= 0 && edad < 3) {
			JOptionPane.showMessageDialog(null, "Eres un bebé, no vas a clases");
			inicio();
		} else if (edad >= 65 && edad <= 99) {
			JOptionPane.showMessageDialog(null, "Dudo que tengas curso academico, seguro estas jubilado");
			inicio();
		} else if (edad >= 100) {
			JOptionPane.showMessageDialog(null, "Dudo que hayas llegado vivo a esta edad");
			inicio();
		} else {
			return;
		}
	}
	
	public static void validadorPromedio(double promedio) {
		if (promedio < 0) {
			JOptionPane.showMessageDialog(null, "Promedios negativos no existen");
			inicio();
		} else if (promedio >= 0 && promedio <= 10) {
			return;
		} else {
			JOptionPane.showMessageDialog(null, "la promedio maximo posible es 10");
			inicio();
		} 
	}
}
