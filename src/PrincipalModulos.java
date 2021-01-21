import java.util.Scanner;

public class PrincipalModulos {

	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		do {

			System.out.println("Menú Gestión Curso");
			System.out.println("1-Añadir un nuevo módulo");
			System.out.println("2-Ver todos los módulos");
			System.out.println("3-Ver horas del curso");
			System.out.println("4-Salir");

			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
				System.out.println("No puede escribir ese dato.");
			}

		} while (opc < 1 || opc > 4);
		{
			return opc;
		}

	}

	public static void main(String[] args) {

		Curso c = new Curso("1ºDAW", "Pepe");
		int aux = 0;

		do {

			switch (pintaMenu()) {

			case 1:
				Curso.nuevoModulo();

				break;

			case 2:
				Scanner leer = new Scanner(System.in);
				System.out.println(c.toString());
				System.out.println("Pulse cualquier tecla para salir de ver todos los modulos");
				String exit;
				exit = leer.next();
				break;

			case 3:

				break;

			case 4:
				aux = 1;

				break;
			}
		} while (aux != 1);

	}

}
