/* 8.25 
Crea una clase Vehículo que implemente los atributos matricula, marca y color.
Desde nuestro main, tendremos que crear objetos de tipo vehículo, para introducir sus valores (con setter) 
y imprimirlos después por pantalla (con getter)
*/



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }public static void main(String[] args) {
        Vehiculo miCoche = new Vehiculo("1234-ABC", "Toyota", "Rojo");
        
        // Accedemos a los atributos usando los getters
        System.out.println("Matrícula: " + miCoche.getMatricula());
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Color: " + miCoche.getColor());
        
        // Modificamos los atributos usando los setters
        miCoche.setMatricula("5678-DEF");
        miCoche.setMarca("Ford");
        miCoche.setColor("Azul");
        
        // Imprimimos los atributos de nuevo para comprobar los cambios
        System.out.println("Matrícula: " + miCoche.getMatricula());
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Color: " + miCoche.getColor());
    }
    
}
