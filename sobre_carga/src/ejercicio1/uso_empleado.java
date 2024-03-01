package ejercicio1;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleado uno = new empleado("Carlos", 12, 2500);

		System.out.println(uno.mostrarDatos() + "\n");

		empleado dos = new empleado("D15", "tomás", 13, 3500);

		System.out.println(dos.mostrarDatos() + "\n");
		
		empleado tres = new empleado("D20", "Clara",10,3000);
		
		System.out.println(tres.mostrarDatos()+"\n");
		
		empleado cuatro = new empleado("Bea", 11, 2000);
		
		System.out.println(cuatro.mostrarDatos() + "\n");
	}

}
