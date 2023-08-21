package Abstraccion;
abstract class Animal {
    private String nombre;
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    abstract void sonido();}
class Perro extends Animal {
    @Override
    void sonido() {System.out.println("Woof!");}}
class Gato extends Animal {
    @Override
    void sonido() {System.out.println("Meow!");}}
public class abstraccion {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.setNombre("Pablo");
        Animal gato = new Gato();
        gato.setNombre("Marco");

        System.out.print("El perro  de nombre " + perro.getNombre() + " hace: ");perro.sonido();
        System.out.print("El gato de nombre " + gato.getNombre() + "hace: ");gato.sonido();
    }
}
