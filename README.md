# Pilares Poo Consulta
### Intregantes: 
Heyer Tinoco, Juan Gualotuña, Juan Falconi

## Pilar 1: Abstraccion
Nos referimos a abstraccion como la creacion de las clases en java para representar conceptos abstractos y sobre todo relevantes **extraidos** de conceptos del mundo real para resolver el problema que tengamos planteado.
Estas clases tienen y definen sus propias propiedades y metodos que permitan una reutilizacion y estructura en el diseño de programas.
Un ejemplo de esto es si queremos crear la Clase Carro. La abstraccion necesaria de sus propiedades adecuadas seria por ejemplo: marca, cilindraje, año. Y metodos como arrancar, frenar, etc. Como vemos, sacamos lo ideal para algun problema, no necesitamos extraer por ejemplo "Diametro de la llanta"

### Ejemplo en Código

--------------------------------------------------------------------------------------
![image](https://github.com/OrlandH/Pilares_Poo/assets/117741739/35850231-cfb3-458e-8f2d-bde335085696)
--------------------------------------------------------------------------------------



En este caso sacamos del mundo real lo necesario para este programa : Que sonido y que nombre tiene algun animal. Asi que creamos la clase animal y subclases perro y gato. Con los metodos respectivos para hacer el programa

El resultado es:



--------------------------------------------------------------------------------------
![image](https://github.com/OrlandH/Pilares_Poo/assets/117741739/422a56e9-45d2-40c6-8630-b7ab3066c8b6)
--------------------------------------------------------------------------------------



Como podemos ver, no se realiza abstraccion de elementos inecesarios como si sacaramos los atributos numero de crias, edad, etc. 

## Pilar 2: Herencia
Nos permite crear nuevas clases basadas en clases existentes. Algo asi como clases hijo, y clases padre donde el hijo podra tener caracteristicas de padre y las propias. Entre las caracteristicas que pasa, lo mas importante es que heredan atributos y metodos.
De esta forma aseguramos que la reutilizacion de código que es importante en la programacion sea implementada de una forma optima estableciendo jerarquías de clases para representar relaciones entre los objetos. 
Un ejemplo seria por ejemplo, tenemos la clase Mamifero con atributos como pelo, lacta, numero de crias y metodos como respira. Si tenemos una subclase que herede de Mamiferos llamda Perro, tendra todos los atributos y metodos de Mamifero, y puede tener caracteristicas propias como nombre, raza, ladrar, aullar, etc.

### Ejemplo en Código

--------------------------------------------------------------------------------------
![image](https://github.com/OrlandH/Pilares_Poo/assets/119060037/630c9255-2c76-42fb-a7e2-1e971c4f762c)
--------------------------------------------------------------------------------------

Creamos una clase padre llamada "Vehiculo" en donde tiene un atributo despues creamos otra clase que sera una subclase llamada "car" que contendra los atributos de su padre que en este caso es la clase "Vehiculo" y para finalizar creamos el main para crear una instancia donde llame a todos metodos de las diferentes clases.

## Pilar 3: Polimorfismo
Es la capacidad de los objetos de diferente clases para ser tratados como objetos de una clase comun mediante clases abstractas e interfaces. 
Esto quiere decir que el codigo sera simplificado y sea necesario hacer varias cosas similares con clases que sean diferentes sin necesidad de modificar algun bucle, operacion, etc. 
Deitel nos dice que es una excelente forma de hacer el código mas generico y flexible al tratar objetos de diferentes clases de manera uniforme. 

### Ejemplo en Código

--------------------------------------------------------------------------------------
![image](https://github.com/OrlandH/Pilares_Poo/assets/117741739/fd0c326c-e00d-4364-9738-ff15c0259ff9)
--------------------------------------------------------------------------------------



Usamos el mismo codigo que en Abstraccion solo que aumentando que el metodo **sonidopol** tiene una funcion propia, y dos clases derivadas respectivamente. 
A todos los objetos creados (perro, gato, animal) le aplicamos el mismo metodo. Pero nos dara resultados diferentes gracias al metodo del polimorfismo. Dandonos como resultado lo siguiente sin necesidad de crear 3 metodos diferentes: 


--------------------------------------------------------------------------------------
![image](https://github.com/OrlandH/Pilares_Poo/assets/117741739/50c48fc4-0281-4d34-8cfe-96bf3daa3b6c)
--------------------------------------------------------------------------------------

## Pilar 4: Encapsulamiento
Se refiere a la combinacion de datos y metodos relacionados para poder ser llamados clases. Esto quiere decir que el uso unico de estos metodos y datos en cada clase es lo que les permite ser POO. Esto se puede definir sencillamente con el uso de modificadores de acceso como **public** , **private** o **protected** . Asi controlamos que parte del código se puede acceder a los miembros internos de una clase y da en este caso para la obtencion y modificacion de estos datos los getters y setters de una forma controlada. 

### Ejemplo en Código
![image](https://github.com/OrlandH/Pilares_Poo/assets/102696740/73025d89-ca47-4a52-bac0-967de8b27669)
![image](https://github.com/OrlandH/Pilares_Poo/assets/102696740/7b07998b-22f1-4c83-8885-0899bba00f73)

la clase Persona encapsula los datos relacionados con una persona (nombre y edad) utilizando métodos para acceder y modificar esos datos. Los miembros name y age son privados, lo que significa que solo pueden ser accedidos y modificados dentro de la misma clase. Los métodos públicos getName y getAge permiten obtener los valores de los miembros privados, mientras que los métodos setName y setAge permiten cambiar esos valores, con algunas restricciones en el caso de setAge.
![image](https://github.com/OrlandH/Pilares_Poo/assets/102696740/a1b32c31-144e-4ab9-8b33-8221bad87c8c)
