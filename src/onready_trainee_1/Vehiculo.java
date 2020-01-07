package onready_trainee_1;

public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private Float precio;

    public Vehiculo(String marca, String modelo, Float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Float getPrecio() {
        return precio;
    }
    
    
    
    
}
