package onready_trainee_1;

/*
Ejercicio Onready
Imaginemos una concesionaria de autos y motos.
Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:

Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
=============================
Vehículo más caro: Peugeot 208
Vehículo más barato: Honda Titan
Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50

Ejercicio extra (si lo haces sumas puntos)
=============================
Vehículos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan

La solución debe cumplir con los siguientes requisitos:
- Diseñar una solución orientada a objetos, creando por lo menos una clase abstracta y una interface.
- La salida es por consola y exactamente como se requiere.
- Usar solamente las clases provistas por Java 8.
- Cargar la lista de autos en un único método. No hay ingreso por pantalla de ningún tipo.
- El algoritmo usado para la impresión no tiene que depender de la cantidad, modelo o tipo de autos
- El entregable deberá ser la URL de un repositorio Git público para que podamos descargar directamente.


Cualquier consulta no duden en preguntar a busquedas@onready.com.ar

 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Javier Caballero whapsapp 1132561298
 */
public class OnReady_Trainee_1 {

    public static List<Vehiculo> listaVehiculos = new ArrayList<>();

    public static void cargarListaVehiculos() {

        listaVehiculos.add(new Auto("Peugeot", "206", 4, 200000.00f));
        listaVehiculos.add(new Moto("Honda", "Titan", 125, 60000.00f));
        listaVehiculos.add(new Auto("Peugeot", "208", 5, 250000.00f));
        listaVehiculos.add(new Moto("Yamaha", "YBR", 160, 80000.50f));

    }

    public static void imprimirListaVehiculos() {

        for (int i = 0; i < OnReady_Trainee_1.listaVehiculos.size(); i++) {

            System.out.println(OnReady_Trainee_1.listaVehiculos.get(i));

        }

    }

    public static void buscarMayorPrecio() {

        float mayorPrecio = OnReady_Trainee_1.listaVehiculos.get(0).getPrecio();
        int indiceMayorPrecio = 0;

        for (int i = 1; i < OnReady_Trainee_1.listaVehiculos.size(); i++) {

            if (mayorPrecio < OnReady_Trainee_1.listaVehiculos.get(i).getPrecio()) {
                indiceMayorPrecio = i;
                mayorPrecio = OnReady_Trainee_1.listaVehiculos.get(i).getPrecio();

            }
        }

        System.out.println(OnReady_Trainee_1.listaVehiculos.get(indiceMayorPrecio));

    }

    public static void buscarMenorPrecio() {

        float menorPrecio = OnReady_Trainee_1.listaVehiculos.get(0).getPrecio();
        int indiceMenorPrecio = 0;

        for (int i = 1; i < OnReady_Trainee_1.listaVehiculos.size(); i++) {

            if (menorPrecio > OnReady_Trainee_1.listaVehiculos.get(i).getPrecio()) {
                indiceMenorPrecio = i;
                menorPrecio = OnReady_Trainee_1.listaVehiculos.get(i).getPrecio();

            }
        }

        System.out.println(OnReady_Trainee_1.listaVehiculos.get(indiceMenorPrecio));

    }

    public static void buscarLetra(String letra) {

    }

    public static void imprimirLista() {

        for (Vehiculo vehiculo : listaVehiculos) {

            System.out.println(vehiculo);

        }

    }

    public static void imprimirSeparacion() {

        System.out.println("========================");

    }

    public static void main(String[] args) {

        cargarListaVehiculos();
        imprimirLista();

        imprimirSeparacion();
        System.out.println("Mayor Precio");
        buscarMayorPrecio();

        imprimirSeparacion();
        System.out.println("Menor Precio");
        buscarMenorPrecio();

        imprimirSeparacion();
        System.out.println("Precios ordenados de Mayor a Menor");
        listaVehiculos.sort((o1, o2) -> o2.getPrecio().compareTo(o1.getPrecio()));
        imprimirLista();
    }

}
