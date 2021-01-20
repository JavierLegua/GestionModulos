
public class Modulos {

	private String nombre;
	private String codigo;
	private int numHoras;
	
	public Modulos(String nombre, String codigo, int numHoras) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.numHoras = numHoras;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	@Override
	public String toString() {
		return "Modulos [nombre=" + nombre + ", codigo=" + codigo + ", numHoras=" + numHoras + "]";
	}
	
	
	
	
	
	
}
