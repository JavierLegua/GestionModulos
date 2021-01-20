import java.util.Scanner;

public class PrincipalModulos {

	public static void main(String[] args) {

		Modulos vModulos[] = new Modulos[7];
		int aux = 0;

		Modulos programacion = new Modulos("Programacion", "PRG", 325);
		Modulos sistemas = new Modulos("Sistemas informaticos", "SI", 257);
		Modulos bbdd = new Modulos("Bases de datos", "BBDD", 180);

		vModulos[0] = programacion;
		vModulos[1] = sistemas;
		vModulos[2] = bbdd;

		for (Modulos m : vModulos) {
			if (m != null) {
				aux += m.getNumHoras();
				System.out.println(m.toString());
			}
		}
		System.out.println("El número total de horas de los módulos es " + aux);
	}

}
