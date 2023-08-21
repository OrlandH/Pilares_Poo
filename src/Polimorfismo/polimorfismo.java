package Polimorfismo;
class Animal {
    void sonidopol() {System.out.println("El animal hace un sonido");}}
class perro extends Animal {
    @Override
    void sonidopol() {System.out.println("El perro Ladra");}}
class gato extends Animal {
    @Override
    void sonidopol() {System.out.println("El gato maulla");}}
public class polimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new perro();
        Animal animal2 = new gato();
        Animal animal3 = new Animal();
        animal1.sonidopol();
        animal2.sonidopol();
        animal3.sonidopol();}}
