# Pilares Poo Consulta
### Intregantes: 
Heyer Tinoco, Juan Gualotuña, Juan Falconi

## Pilar 1: Abstraccion
Nos referimos a abstraccion como la creacion de las clases en java para representar conceptos abstractos y sobre todo relevantes **extraidos** de conceptos del mundo real para resolver el problema que tengamos planteado.
Estas clases tienen y definen sus propias propiedades y metodos que permitan una reutilizacion y estructura en el diseño de programas.
Un ejemplo de esto es si queremos crear la Clase Carro. La abstraccion necesaria de sus propiedades adecuadas seria por ejemplo: marca, cilindraje, año. Y metodos como arrancar, frenar, etc. Como vemos, sacamos lo ideal para algun problema, no necesitamos extraer por ejemplo "Diametro de la llanta"

### Ejemplo en Código


## Pilar 2: Herencia
Nos permite crear nuevas clases basadas en clases existentes. Algo asi como clases hijo, y clases padre donde el hijo podra tener caracteristicas de padre y las propias. Entre las caracteristicas que pasa, lo mas importante es que heredan atributos y metodos.
De esta forma aseguramos que la reutilizacion de código que es importante en la programacion sea implementada de una forma optima estableciendo jerarquías de clases para representar relaciones entre los objetos. 
Un ejemplo seria por ejemplo, tenemos la clase Mamifero con atributos como pelo, lacta, numero de crias y metodos como respira. Si tenemos una subclase que herede de Mamiferos llamda Perro, tendra todos los atributos y metodos de Mamifero, y puede tener caracteristicas propias como nombre, raza, ladrar, aullar, etc.

### Ejemplo en Código

## Pilar 3: Polimorfismo
Es la capacidad de los objetos de diferente clases para ser tratados como objetos de una clase comun mediante clases abstractas e interfaces. 
Esto quiere decir que el codigo sera simplificado y sea necesario hacer varias cosas similares con clases que sean diferentes sin necesidad de modificar algun bucle, operacion, etc. 
Deitel nos dice que es una excelente forma de hacer el código mas generico y flexible al tratar objetos de diferentes clases de manera uniforme. 

### Ejemplo en Código

## Pilar 4: Encapsulamiento
Se refiere a la combinacion de datos y metodos relacionados para poder ser llamados clases. Esto quiere decir que el uso unico de estos metodos y datos en cada clase es lo que les permite ser POO. Esto se puede definir sencillamente con el uso de modificadores de acceso como **public** , **private** o **protected** . Asi controlamos que parte del código se puede acceder a los miembros internos de una clase y da en este caso para la obtencion y modificacion de estos datos los getters y setters de una forma controlada. 

### Ejemplo en Código
