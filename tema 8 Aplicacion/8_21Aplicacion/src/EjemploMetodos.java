public class EjemploMetodos {
    
    // Método que recibe un objeto y devuelve true si es de tipo numérico (Integer, Double, Long, Float, etc.)
  public static boolean esNumero(Object ob) {
    // Utilizamos la instanciaof para verificar si el objeto es de tipo Number (número)
    return ob instanceof Number;
  }
  /*Método que recibe dos objetos y los suma si ambos son de tipo numérico (Integer, Double, Long, Float, etc.) 
   o los concatena si ambos son de tipo String. Si no, muestra el mensaje "No sumables".*/
  public static void sumar(Object a, Object b) {
     // Verificamos si ambos objetos son de tipo String
    if (a instanceof String && b instanceof String) {
        // Si son de tipo String, los concatenamos
      System.out.println((String) a + (String) b);
    } 
    // Verificamos si ambos objetos son de tipo Number (numérico)
    else if (a instanceof Number && b instanceof Number) {
      // Si son de tipo Number, los convertimos a Double y los sumamos  
      double resultado = ((Number) a).doubleValue() + ((Number) b).doubleValue();
      System.out.println(resultado);
    } else {
        // Si no son de tipo String o de tipo Number, mostramos el mensaje "No sumables"
      System.out.println("No sumables");
    }
  } 
}
