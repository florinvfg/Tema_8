/*  8.16

Diseña la clase Pila heredando de Lista (ver actividad resuelta 7.13)

 * 
 */


 public class Main {
    public static void main(String[] args) throws Exception {
        Pila p = new Pila();
        System.out.println(p.desapilar()); //Imprime en la consola el resultado de llamar al método desapilar()en la pila vacía
        for (int i = 0; i < 10; i++) { //Realiza un bucle forque se ejecuta 10 veces. En cada iteración, se llama al método apilar(i)en la pila "p"
            p.apilar(i);
            p.mostrar();
    }
    Integer num = p.desapilar(); 
    //Asigna el resultado de llamar al método desapilar()en la pila pa la variable num. Si la pila está vacía, numtendrá el valor null.
    while (num !=null) { 
        // Realiza un bucle whileque se ejecuta mientras numno sea null. Dentro del bucle, se imprime en la consola
        System.out.println(num + " ");
        num = p.desapilar(); // Realiza un bucle whileque se ejecuta mientras numno sea null. Dentro del bucle, se imprime en la
    }
}
}
