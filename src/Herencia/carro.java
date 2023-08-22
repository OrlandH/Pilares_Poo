package Herencia;

class Vehiculo{
    void inicio(){
        System.out.println("El carro esta iniciando");
    }
}

class Car extends Vehiculo {
    void aceleracion(){
        System.out.println("El carro esta acelerando");
    }
}

public class carro {
    public static void main(String[] args) {
        Car carro = new Car();
        carro.aceleracion();
        carro.inicio();
    }
}
