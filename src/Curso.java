import java.util.Arrays;
import java.util.Scanner;

public class Curso {

	private String nombre, tutor;
	private static Modulos vModulos[];

	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulos[10];
	}

	public static void nuevoModulo() {
		Scanner leer = new Scanner(System.in);
		String nuevoModulo = "";
		String nuevoCodigo = "";
		int nuevaHora = 0;
		int totalHoras = 0;

		System.out.println("Dime el nombre del nuevo módulo.");
		nuevoModulo = leer.next();
		System.out.println("Dime el código del nuevo módulo.");
		nuevoCodigo = leer.next();
		System.out.println("Dime el número de horas que tiene el nuevo módulo.");
		nuevaHora = leer.nextInt();

		for (int i = 0; i < vModulos.length; i++) {
			if (vModulos[i] == null) {
				vModulos[i] = new Modulos(nuevoModulo, nuevoCodigo, nuevaHora);
				totalHoras += nuevaHora;
				break;
			}
		}
		for (int j = 0; j < 10; j++) {
			System.out.println();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public Modulos[] getvModulos() {
		return vModulos;
	}

	public void setvModulos(Modulos[] vModulos) {
		this.vModulos = vModulos;
	}

	@Override
	public String toString() {
		String datos = "";
		for (Modulos modulos : vModulos)
			if (modulos != null) {
				datos += modulos.toString() + "\n";
			}

		return nombre + "\n" + tutor + " \nMódulos\n------------\n" + datos;
	}

}
