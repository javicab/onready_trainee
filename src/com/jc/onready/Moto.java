package com.jc.onready;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Moto extends Vehiculo {
    
    int cilindrada = 0;

    public Moto(String marca, String modelo, int cilindrada , float precio) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }
    
    
    public void setCilindrada (int cilindrada){
    
        this.cilindrada = cilindrada;
    }
    
	public String formatearPrecio(Float precio) {
    	
	DecimalFormatSymbols symbolsDE_DE = DecimalFormatSymbols.getInstance(Locale.GERMANY);
	DecimalFormat formatDE_DE = new DecimalFormat("#,###.00", symbolsDE_DE);
	// prints -123.456,89
	String number = formatDE_DE.format(precio);
	return number;
    	
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca()+ " // " +
        "Modelo: " + super.getModelo() + " // " +
        "Cilindrada: " + this.cilindrada + "c // " +
        "Precio: $" + this.formatearPrecio(super.getPrecio());
    }
}
    
