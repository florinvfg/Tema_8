/*  8.19

Un conjunto es un objeto similar a la listas,capaz de guardar valores de un tipo determinado,con la diferencia 
de que sus elemnetos no pueden estar repetidos.Escribe la clase conjunto para enteros heredando de Lista y 
reimplementando los metodos de insercion para evitar las repeticiones.

 * 
 */



 public class Main {
    //prueba los metodos de la clase Lista
    public static void main(String[] args) {
       Lista l1 = new Lista();
       Lista l2 = new Lista();
       l1.insertarFinal(4);
       l1.insertarFinal(5);
       l1.insertarFinal(6);
       l1.mostrar();
       l1.insertarPrincipio(3);
       l1.insertarPrincipio(2);
       l1.insertarPrincipio(1);
       l1.mostrar();
       l1.insertar(2, 99);
       l1.mostrar();
       l1.eliminar(2);
       l1.mostrar();
       System.out.println(l1.buscar(4));
       l2.insertarFinal(10);
       l2.insertarFinal(20);
       l2.insertarFinal(30);
       l2.insertarFinal(40);
       l2.insertarFinal(50);
       l2.mostrar();
       l1.insertarFinal(l2);
       l1.mostrar();

    }
}
