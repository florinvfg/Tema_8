/*  8.15

Escribe en la clase Lista un metodo equals() para compararlas.Dos listas consideran iguales si tienen
 los mismos elementos (incluidas las repeticiones)en el mismo orden.

 */






public class Main {
    public static void main(String[] args) throws Exception {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        l1.insertarFinal(4);
        l1.insertarFinal(5);
        l1.insertarFinal(6);
        l1.insertarPrincipio(3);
        l1.insertarPrincipio(2);
        l1.insertarPrincipio(1);
        l1.insertar(2, 99);
        l1.eliminar(2);
        System.out.println(l1.buscar(4));
        System.out.println("Mensaje de prueba");
        l2.insertarFinal(4);
        l2.insertarFinal(5);
        l2.insertarFinal(6);
        l2.insertarPrincipio(3);
        l2.insertarPrincipio(2);
        l2.insertarPrincipio(1);
        l2.insertar(2, 99);
        l2.eliminar(2);
        System.out.println(l1);
        System.out.println(l2);
        
      
      if (l1.equals(l2)) {
        System.out.println("Las listas son iguales");
    } else {
        System.out.println("Las listas no son iguales");
    }
  }
    
}
