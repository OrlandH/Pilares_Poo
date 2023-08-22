package Herencia;

class auto {
    void inicio() {
        System.out.println("Vehiculo comenzando...");
    }
}
class Car extends auto {
    void acelerando() {
        System.out.println("El carro esta acelerando...");
    }
}

public class Vehiculo {
    public static void main(String[] args) {

        Car car = new Car();
        car.inicio();
        car.acelerando();

    }
}
