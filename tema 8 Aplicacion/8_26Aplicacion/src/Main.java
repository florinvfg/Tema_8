import java.sql.Date;
import java.time.LocalDateTime;

/*  8.26

A partir de la clase Calendario,implementada en la Actividad de aplicacion 7.15,escribe la clase CalendarioExacto,que
 determina un instante de tiempo exacto formado por un año,un mes,un dia,una hora y un minuto.Implementa los metodos
  toString(),equals() y aquellos necesarios para manejar la clase.
 * 
 */




 public class Main {
    private static int dia, mes, año;

    public static void main(String[] args) {
        // Crea un objeto Calendario con la fecha 2020/01/01
        Calendario calendario = new Calendario(2020, 1, 1);

        // Muestra la fecha actual
        System.out.println(calendario);

        // Incrementa el día y muestra la nueva fecha
        calendario.incrementarDia();
        System.out.println();

        // Incrementa el mes y muestra la nueva fecha
        calendario.incrementarMes();
        
        System.out.println();

        // Incrementa el año y muestra la nueva fecha
        calendario.incrementarAño(2);
        System.out.println();

        // Muestra la fecha en formato dd/mm/aaaa
        calendario.mostrar();

        // Compara si el objeto calendario es igual a otra fecha
        System.out.println(calendario.iguales(new Calendario(2020, 1, 1))); // true
        System.out.println(calendario.iguales(new Calendario(2020, 2, 1))); // false
        System.out.println();
      
        // Utilizando java.util.Date (obsoleto en Java 8+)
        Date fecha = new Date(año);
        System.out.println(fecha.toString());

        // Utilizando java.time.LocalDateTime
        LocalDateTime fecha2 = LocalDateTime.now();
        System.out.println( fecha2.toString ());
    }


        
    }

