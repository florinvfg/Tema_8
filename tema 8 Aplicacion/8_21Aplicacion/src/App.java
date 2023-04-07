/*8.21

Implementa los siguuientes metodos:
-static boolean esNumero(Object ob),que nos dice si su parametro de entrada es de tipo numerico 
(Integer, Double, Long, Float...).
-boolean sumar(Object a, Object b),que muestra por consola la concatenacion de los parametros de entrada,
si ambos son cadenas,o muestra su suma convertida altipo Double,si ambos son de tipo numericos.En cualquier
 otro caso,muestra el mensaje "No sumables". */




public class App {
  public static void main(String[] args) {
    Object a = 10;
    Object b = 20.5;
    Object c = "Suerte en tu ";
    Object d = "programacion";
    Object e = true;
// Verificamos si los objetos son de tipo numérico o no y mostramos el resultado
    System.out.println("¿Es " + a + " un número? " + esNumero(a));
    System.out.println("¿Es " + b + " un número? " + esNumero(b));
    System.out.println("¿Es \"" + c + "\" un número? " + esNumero(c));
    System.out.println("¿Es \"" + d + "\" un número? " + esNumero(d));
    System.out.println("¿Es " + e + " un número? " + esNumero(e));
// Sumamos o concatenamos los objetos y mostramos el resultado
    System.out.print("Suma de \"" + c + "\" y \"" + d + "\": ");
    sumar(c, d);

    System.out.print("Suma de " + a + " y " + b + ": ");
    sumar(a, b);

    System.out.print("Suma de \"" + c + "\" y " + a + ": ");
    sumar(c, a);

    System.out.print("Suma de " + b + " y \"" + d + "\": ");
    sumar(b, d);

    System.out.print("Suma de " + a + " y \"" + e + "\": ");
    sumar(a, e);
  }

  private static void sumar(Object c, Object d) {
  }

  private static String esNumero(Object a) {
    return null;
  }

}


