package Encapsulamiento;

public class encapsulamiento {
        public static void main(String[] args) {
            Persona personas = new Persona();
            personas.setName("Juan");
            personas.setAge(25);

            System.out.println("Name: " + personas.getName());
            System.out.println("Age: " + personas.getAge());
        }
}

