/*  8.11
Crea la clase Campana que hereda de la clase Instrumento (definida en la Actividad resuelta 8.4)
 */

 public class Main {
    public static void main(String[] args) {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.RE, Nota.SOL, Nota.FA} ;
        Campana p = new Campana();
        for (Nota nota : cancion) {//añadimos las notas al piano
            p.addNota(nota);
        }        
        p.interpretar ();
    }
}