/*  Resuelta 8.4

Crear la clase abstracta Instrumento,que almacena en una tabla las notas musicales
 de una melodia(dentro de una misma octava).El metodo add[] añade nuevas notas musicales.
 La clase tambien dispone del metodo abstracto interpretar[] que, en cada subclase que
  herede de Instumento,mostrara por consola las notas musicales segun las interprete.
  Utilizar enumerados para definir las notas musicales.
 * 
 */

 public class Main {
    public static void main(String[] args, Object nota) {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.RE, Nota.SOL, Nota.FA} ;
        Piano p = new Piano();
        for (Nota nota2 : cancion) {//añadimos las notas al piano
            p.addNota(nota2);
        }        
        p.interpretar ();
    }
}