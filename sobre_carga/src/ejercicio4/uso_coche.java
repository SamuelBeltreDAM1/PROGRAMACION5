package ejercicio4;

import javax.swing.JOptionPane;

public class uso_coche {
	
	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {

		String marca =JOptionPane.showInputDialog("Elige entre el SEAT o CITROEN");
		validadorMarca(marca);
		coche coche1 = new coche(marca);
	int op = Integer.parseInt(JOptionPane.showInputDialog("Mostar coches disponibles (PULSE 1)\nDetallar Modelo (PULSE 2)"));
		if (op==1) {
			coche1.datosGeneralesCoche();
		}else if (op==2) {
		String modelo=JOptionPane.showInputDialog(null, "modelo del coche");
		validadorModelo(marca,modelo);
		coche carro2 = new coche(marca,modelo);
		carro2.datosEspecificosCoche();
		}else {
			JOptionPane.showMessageDialog(null, "No se puede operar con este numero");
			inicio();
		}
	}
	
	public static void validadorMarca(String carro) {
		if(carro.equalsIgnoreCase("seat")||carro.equalsIgnoreCase("citroen")) {
			return;
		}else {
			JOptionPane.showMessageDialog(null, "No disponemos de esta marca de coche");
			inicio();
		}
	}
	
	public static void validadorModelo(String marca,String modelo) {
		if (modelo.equalsIgnoreCase("leon")||modelo.equalsIgnoreCase("ibiza")||modelo.equalsIgnoreCase("c3")
				||modelo.equalsIgnoreCase("c5")) {
			return;
		}else {
			JOptionPane.showMessageDialog(null, "No disponemos de esta modelo de coche");
			inicio();
		}
	}

}
