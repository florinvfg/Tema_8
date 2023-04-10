/*
8.18

Diseña la clase ColaDoble,que ereda de Cola para enteros,añadiendo los siguientes metodos:
-void encolarPrincipio(); ,que encola un elemento al principio de la cola.
-Integer desencolarFinal(); ,que desencola un elemento del final de la cola. */




public class Main {
    public static void main(String[] args)  {
        Cola p = new Cola ();
       System.out.println( p . desencolar ());
       for ( int  i = 0 ; i < 10 ; i ++) {
        p.encolar (i);
        
    }
     Integer num = p.desencolar();
     while (num != null) {
        System.out.println(num + " ");
        num = p.desencolar();
     }
   }
 }
