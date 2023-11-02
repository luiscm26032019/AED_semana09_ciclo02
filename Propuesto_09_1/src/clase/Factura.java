package clase;

public class Factura {
	private String ruc, empresa;
	private int unidades;
	private double precioUnitario;
	
	//Constructor
	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
	}
	
	//Get/Set
	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	//M�todos
	public double importeFacturado() {
		return unidades * precioUnitario;
	}
}

