package arreglo;

import java.util.ArrayList;


import clase.Factura;

public class ArregloFacturas {
	private ArrayList <Factura> fac;
	
	//Constructor
	public ArregloFacturas() {
        fac = new ArrayList <Factura> ();
    	adicionar(new Factura("123", "Ana", 19, 15));
    	adicionar(new Factura("456", "Juan", 15, 14));
    	adicionar(new Factura("789", "Pedro", 17, 19));
    	adicionar(new Factura("302", "David", 13, 18));
    	adicionar(new Factura("417", "Carlos", 20, 19));
    	adicionar(new Factura("641", "Jorge", 12, 13));
    	adicionar(new Factura("208", "María", 15, 17));
    	adicionar(new Factura("820", "José", 11, 10));
    }
	
	//Operaciones públicas básicas
	public void adicionar(Factura x) {
		fac.add(x);
	}
	public int tamanio() {
		return fac.size();
	}
	public Factura obtener(int i) {
		return fac.get(i);
	}
	
	//Operaciones públicas complementarias
	public double sumaImpFac() {
		double suma=0;
		for(int i=0; i<tamanio(); i++) {
			suma += obtener(i).importeFacturado();
		}
		return suma;
	}
	
	public double impPromFac() {
		return sumaImpFac()/tamanio();
	}
	
	public double menorImpFac() {
		double menor=obtener(0).importeFacturado();
		for(int i=0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado() < menor){
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}
	
	public double mayorImpFac() {
		double mayor=0;
		for(int i=0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado() > mayor){
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}
	
	public String nomPrimEmp() {
		for(int i=0; i<tamanio(); i++) {
			if(obtener(i).importeFacturado() < impPromFac()) {
				return obtener(i).getEmpresa();
			}
		}
		return "error";
	}
	
}
