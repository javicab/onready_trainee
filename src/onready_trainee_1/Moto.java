package onready_trainee_1;

public class Moto extends Vehiculo implements Caracteristicas {
    
    int puertas = 0;
    int cilindrada = 0;

    public Moto(String marca, String modelo, int cilindrada , float precio) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }
    

    
    @Override
    public void setCantidadPuertas(int puertas){
        
        
    
    }
    
    @Override
    public void setCilindrada (int cilindrada){
    
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca()+ " // " +
        "Modelo: " + super.getModelo() + " // " +
        "Cilindrada: " + this.cilindrada + "cc // " +
        "Precio: $" + super.getPrecio();
    }
    
    
    
    
    
}
