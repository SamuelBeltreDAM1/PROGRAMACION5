package ejercicio1;

public class empleado {
	private String nombre;
	private double salario;
	private int Ndep;
	private static String codigoJefe;

	public empleado(String nombre, int Ndep, double salario) {
		this(codigoJefe, nombre, Ndep, salario);
		codigoJefe = "No es jefe/jefa";
	}

	public empleado(String codigoJefe, String nombre, int Ndep, double salario) {
		this.nombre = nombre;
		this.Ndep = Ndep;
		this.salario = salario;
		empleado.codigoJefe = codigoJefe;
	}

	public String mostrarDatos() {

		return "CODIGO JEFE: " + codigoJefe + "\nNOMBRE DEL EMPLEADO: " + nombre + "\nNUMERO DEL DEPARTAMENTO: " + Ndep
				+ "\nSALARIO: " + salario;

	}
}
