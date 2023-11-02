package clase;

public class Docente {
	private int codigo, horas;
	private String nombre;
	private double tarifa;
	
	public Docente(int codigo, int horas, String nombre, double tarifa) {
		this.codigo = codigo;
		this.horas = horas;
		this.nombre = nombre;
		this.tarifa = tarifa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public double sueldo() {
		return horas*tarifa;
	}
	
	
}
