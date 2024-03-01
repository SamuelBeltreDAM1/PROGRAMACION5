package ejercicio3;

import javax.swing.JOptionPane;

public class uso_producto {

	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {

		String nombre;
		String tipo;

		try {
				nombre = JOptionPane.showInputDialog("NOMBRE DEL PRODUCTO");
				validadorNombre(nombre);
				int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Mostrar datos del producto " + nombre
						+ " (PULSE 1)\n" + "Especificar material de l@s " + nombre + " (PULSE 2)\n"));
				if (op == 1) {
					producto producto = new producto(nombre);
					producto.mostrarDatos();
					inicio();
				} else if (op == 2) {
					tipo = JOptionPane.showInputDialog("Introduzca el tipo de material de l@s " + nombre+" (madera o cristal)");
					validadorTipo(nombre, tipo);
					producto producto = new producto(nombre, tipo);
					producto.mostrarDatosTipo();
					inicio();
				} else {
					JOptionPane.showMessageDialog(null, "Con este numero no se puede operar");
					inicio();
				}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Has salido");
		}
	}

	public static void validadorNombre(String nombre) {

		if (nombre.equalsIgnoreCase("mesas") || nombre.equalsIgnoreCase("armarios")
				|| nombre.equalsIgnoreCase("sillas")) {
			return;
		} else {
			JOptionPane.showMessageDialog(null, "No disponemos de " + nombre + " en nuestro inventario");
			inicio();
		}
	}

	public static void validadorTipo(String nombre, String tipo) {
		if (tipo.equalsIgnoreCase("madera") || tipo.equalsIgnoreCase("cristal")) {
			return;
		} else {
			JOptionPane.showMessageDialog(null, "No hay " + nombre + " con este tipo de material");
		}
	}
}
