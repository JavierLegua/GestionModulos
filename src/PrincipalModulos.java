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
		
		try{
		opc=leer.nextInt();
		}catch (Exception e){
			opc = 0;
			leer = new Scanner(System.in);
		}
		
		} while (opc<1||opc>4); {
			return opc;	
		}
		
	}
	
	public static void main(String[] args) {

		pintaMenu();
		
		/**
		 * Curso c = new Curso("1ºDAW", "Pepe");
		 * System.out.println(c.toString());
		 */
		
		
	}

}
