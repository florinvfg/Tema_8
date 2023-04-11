public class Vehiculo {
    private String matricula;
    private String marca;
    private String color;

    // Constructor
    public Vehiculo(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }

    // Setter para matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter para matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter para color
    public String getColor() {
        return color;
    }
}
/*public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String color;

    // Constructor
    public Vehiculo(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }

    // Getter y Setter para matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    // Getter y Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // Getter y Setter para color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Método abstracto para obtener el número de ruedas de cada vehículo
    public abstract int numeroDeRuedas();
}

public class Moto extends Vehiculo {
    private final int numRuedas = 2;

    // Constructor
    public Moto(String matricula, String marca, String color) {
        super(matricula, marca, color);
    }

    // Implementación del método abstracto de Vehiculo
    @Override
    public int numeroDeRuedas() {
        return numRuedas;
    }
}

public class Coche extends Vehiculo {
    private final int numRuedas = 4;

    // Constructor
    public Coche(String matricula, String marca, String color) {
        super(matricula, marca, color);
    }

    // Implementación del método abstracto de Vehiculo
    @Override
    public int numeroDeRuedas() {
        return numRuedas;
    }
}
En el código anterior, hemos creado dos nuevas clases, Moto y Coche, que heredan de la clase Vehiculo. También
 hemos agregado un método abstracto llamado numeroDeRuedas() en la clase Vehiculo, que devuelve el número de 
 ruedas de cada vehículo.

En la clase Moto, hemos definido que el número de ruedas es igual a 2 y en la clase Coche, hemos definido que 
el número de ruedas es igual a 4. Luego, hemos implementado el método abstracto numeroDeRuedas() en ambas 
clases, devolviendo el número de ruedas correspondiente.

Para crear objetos de tipo Moto y Coche desde el main, podemos hacer lo siguiente:

 public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Moto
        Moto miMoto = new Moto("4567-DEF", "Honda", "Negro");
        // Creamos un objeto de la clase Coche
        Coche miCoche = new Coche("1234-ABC", "Toyota", "Rojo");
    
        // Accedemos a los atributos y al método abstracto usando getters y el método
        // de la clase Vehiculo
        System.out.println("Moto - Matrícula: " + miMoto.getMatricula());
        System.out.println("Moto - Marca: " + miMoto.getMarca());
        System.out.println("Moto - Color: " + miMoto.getColor());
        System.out.println("Moto - Número de ruedas: " + miMoto.numeroDeRuedas());

        System.out.println("Coche - Matrícula: " + miCoche.getMatricula());
        System.out.println("Coche - Marca: " + miCoche.getMarca());
        System.out.println("Coche - Color: " + miCoche.getColor());
        System.out.println("Coche - Número de ruedas: " + miCoche.numeroDeRuedas());
    }
}
En el main, creamos dos objetos de las clases Moto y Coche con sus respectivas matrículas, marcas y colores. 
Luego, utilizamos los getters para obtener los valores de los atributos de cada objeto y el método
 numeroDeRuedas() de la clase Vehiculo para obtener el número de ruedas de cada vehículo.

Finalmente, imprimimos los valores por pantalla usando System.out.println().
*/