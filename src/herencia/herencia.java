package herencia;

public class herencia {
    public static void main(String[] args) {
        automovil chevrolet = new automovil();
        chevrolet.acelerar(); // Metodo de la clase automovil
        chevrolet.arrancar(); // Metodo de la clase Vehiculo

        /* al imstanciar el objeto chevrolet de la clase automovil este hereda los metodos
        y atributos de la clase vehiculo.
         */
    }
}
