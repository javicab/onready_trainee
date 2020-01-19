package com.jc.onready;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Concesionaria implements Servicio {
	
	private List<Vehiculo> listaVehiculos = new ArrayList<>();
	
	Concesionaria(List<Vehiculo> listaVehiculos){
		
		this.listaVehiculos= listaVehiculos;
	
	}
	
	
	
	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}



	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}



	public String formatearPrecio(Float precio) {
    	
    	DecimalFormatSymbols symbolsDE_DE = DecimalFormatSymbols.getInstance(Locale.GERMANY);
    	DecimalFormat formatDE_DE = new DecimalFormat("#,###.00", symbolsDE_DE);
    	// prints -123.456,89
    	String number = formatDE_DE.format(precio);
    	return number;
    	
    }
	
	public void cargarListaVehiculos() {

        this.listaVehiculos.add(new Auto("Peugeot", "206", 4, 200000.00f));
        this.listaVehiculos.add(new Moto("Honda", "Titan", 125, 60000.00f));
        this.listaVehiculos.add(new Auto("Peugeot", "208", 5, 250000.00f));
        this.listaVehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50f));

    }

    public void imprimirListaVehiculos() {

        for (int i = 0; i < this.listaVehiculos.size(); i++) {

            System.out.println(this.listaVehiculos.get(i));

        }

    }
    
    public void imprimirListaOrdenada() {
    	
    	for (int i = 0; i < this.listaVehiculos.size(); i++) {

            System.out.println(extraerMarcaModelo(i));

        }
    	
    }

    public int buscarMayorPrecio() {

        float mayorPrecio = this.listaVehiculos.get(0).getPrecio();
        int indiceMayorPrecio = 0;

        for (int i = 1; i < this.listaVehiculos.size(); i++) {

            if (mayorPrecio < this.listaVehiculos.get(i).getPrecio()) {
                indiceMayorPrecio = i;
                mayorPrecio = this.listaVehiculos.get(i).getPrecio();
            }
        }

        //System.out.println(App.listaVehiculos.get(indiceMayorPrecio));
        return indiceMayorPrecio;
    }
    
    public String imprimirMarcaModelo(int indice) {
    	
    	return this.listaVehiculos.get(indice).getMarca() + " " + this.listaVehiculos.get(indice).getModelo();
    	
    }

    public int buscarMenorPrecio() {

        float menorPrecio = this.listaVehiculos.get(0).getPrecio();
        int indiceMenorPrecio = 0;

        for (int i = 1; i < this.listaVehiculos.size(); i++) {

            if (menorPrecio > this.listaVehiculos.get(i).getPrecio()) {
                indiceMenorPrecio = i;
                menorPrecio = this.listaVehiculos.get(i).getPrecio();

            }
        }

        //System.out.println(App.listaVehiculos.get(indiceMenorPrecio));
        return indiceMenorPrecio;

    }


    public void imprimirLista() {

        for (Vehiculo vehiculo : listaVehiculos) {

            System.out.println(vehiculo);

        }

    }
    
    public int buscarLetraEnNombre(String letra) {
    		    	
    	for (int i = 1; i < this.listaVehiculos.size(); i++) {
            if (App.listaVehiculos.get(i).getMarca().contains(letra)) {
                return i;
            }
        }
    	return -1; //no encontrado
    }
    

    public String extraerMarcaModelo(Integer indice) {
    	String marcaModelo = "";
    	marcaModelo = this.listaVehiculos.get(indice).getMarca() + " " + this.listaVehiculos.get(indice).getModelo();
    	return marcaModelo;
    }
    
    public String extraerMarcaModeloPrecio(Integer indice) {
    	String marcaModeloPrecio = "";
    	marcaModeloPrecio = this.listaVehiculos.get(indice).getMarca() + " " + this.listaVehiculos.get(indice).getModelo() + " " + App.listaVehiculos.get(indice).getPrecio();
    	return marcaModeloPrecio;
    }
    
    public List<Vehiculo> ordenarListaDeMayorAMenorPorPrecio(List<Vehiculo> listaVehiculos) {
    	
    	List<Vehiculo> listaVehiculosCopiada = new ArrayList<Vehiculo>(listaVehiculos);
    	
    	listaVehiculosCopiada.sort((v1, v2) -> v2.getPrecio().compareTo(v1.getPrecio()));
    	
    	
    	return listaVehiculosCopiada;
    }
    
    public void imprimirListaOrdenada(List<Vehiculo> listaVehiculos) {

        for (int i = 0; i < listaVehiculos.size(); i++) {

            System.out.println(listaVehiculos.get(i));

        }

    }

    public void imprimirSeparacion() {

        System.out.println("========================");

    }

}
