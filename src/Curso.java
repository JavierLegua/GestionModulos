import java.util.Arrays;

public class Curso {

	private String nombre, tutor;
	private Modulos vModulos[];

	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulos[10];
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
        String datos ="";
        for (Modulos modulos : vModulos)
        if(modulos!=null){
            datos+= modulos.toString() + "\n";
        }


        return  nombre +"\n" + tutor + " \nMódulos\n------------\n" + datos;
    }

}
