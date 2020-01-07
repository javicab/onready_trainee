package onready_trainee_1;

public class Auto extends Vehiculo implements Caracteristicas {
    
    int puertas = 0;
    float cilindrada = 0;

    public Auto(String marca, String modelo, int puertas, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    

    
    
    @Override
    public void setCantidadPuertas(int puertas){
    
        this.puertas = puertas;
    }
    
    @Override
    public void setCilindrada (int cilindrada){
    
        
    }
    
    @Override
    public String toString() {
        return "Marca: " + super.getMarca()+ " // " +
        "Modelo: " + super.getModelo() + " // " +
        "Puertas: " + this.puertas + " // " +
        "Precio: $" + super.getPrecio();
    }
    
}
