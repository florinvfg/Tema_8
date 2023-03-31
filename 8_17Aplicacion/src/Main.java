/*  8.16

Diseña la clase Pila heredando de Lista (ver actividad resuelta 7.13)

 * 
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Cola c = new Cola();
        System.out.println(c.desencolar()); // Imprime en la consola el resultado de llamar al método desencolar()en la
                                            // cola vacía
        for (int i = 0; i < 10; i++) { // Realiza un bucle forque se ejecuta 10 veces. En cada iteración, se llama al
                                       // método encolar(i)en la cola "c"
            c.encolar(i);
            c.mostrar();
        }
        Integer num = c.desencolar();
        // Asigna el resultado de llamar al método desencolar()en la cola pa la variable
        // num. Si la cola está vacía, num tendrá el valor null.

        while (num != null) {
            System.out.println(num + " ");
            num = c.desencolar();
        }

        System.out.println(num + " ");
        System.out.println(c.mostrar());

        Pila p = new Pila();
        System.out.println(c.desencolar());
        for (int i = 0; i < 10; i++) {

            // método encolar(i)en la cola "c"
            p.apilar(i);
            p.desapilar();
        }
        Integer num2 = p.desapilar();
        // Asigna el resultado de llamar al método desencolar()en la cola pa la variable
        // num. Si la cola está vacía, num tendrá el valor null.

        while (num2 != null) {
            System.out.println(num2 + " ");
            num2 = p.desapilar();

            System.out.println(num2 + " ");

        }
    }
}
