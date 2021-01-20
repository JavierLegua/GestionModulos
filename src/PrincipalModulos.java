
public class PrincipalModulos {

	public static void main(String[] args) {
		
		Modulos p = new Modulos("Programacion", "PRG", 300);
		Modulos s = new Modulos("Sistemas informaticos", "SI", 300);
		Modulos b = new Modulos("Bases de datos", "BBDD", 300);
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(b.toString());

	}

}
