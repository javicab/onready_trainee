package com.jc.onready;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Auto extends Vehiculo {
    
    int cantidadPuertas = 0;
    
    public Auto(String marca, String modelo, int cantidadPuertas, float precio) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }
        
    
    public void setCantidadPuertas(int cantidadPuertas){
    
        this.cantidadPuertas = cantidadPuertas;
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
        "Puertas: " + this.cantidadPuertas + " // " +
        "Precio: $" + this.formatearPrecio(super.getPrecio());
    }
    
}