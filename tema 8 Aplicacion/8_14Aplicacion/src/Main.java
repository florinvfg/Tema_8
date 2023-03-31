/* 8.14
Reimplementa en la clase Lista de la actividad resuelta 7.11,sustituyendo el metodo mostrar() por el metodo toString().

 * 
 */



public class Main {
    public static void main(String[] args) {  // prueba de los metodos de la clase LISTA
        
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
          System.out.println(l1.buscar (4));
          System.out.println("Mensaje de prueba");
          l2.insertarFinal(10);
          l2.insertarFinal(20);
          l2.insertarFinal(30);
          l2.insertarFinal(40);
          l2.insertarFinal(50);
          l1.insertarFinal(12);
          System.out.println(l1);
          System.out.println(l2);
        }
    }
    
    
    

