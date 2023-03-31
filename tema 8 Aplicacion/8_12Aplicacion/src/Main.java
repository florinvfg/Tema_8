/*   8.12

Las empresas de transporte,para evitar daños en los paquetes,embalan todas sus mercancias en cajas con el tamaño adecuado.
Una caja se crea expresamente con un ancho,un alto y un fondo y,una vez creada,se mantiene inmutable.Cada caja lleva pegada 
una etiqueta,de un maximo de 30 caracteres,con informacion util como el nombre del destinatario,direccion,etc.Implementa la
 clase Caja con los siguientes metodos:
-Caja(int ancho, int alto, int fondo, Unidad unidad);que construye una caja con las dimenciones especificadas,que pueden 
encontrarse en "cm"(centimetros) o "m" (metros).
-double getVolumen(); que devuelve el volumen de la caja en metros cubicos.
-void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
-String toString(); que devuelve una cadena con la representacion de la caja.
 */

public class Main {


            public static void main(String[] args) {
            Caja caja1 = new Caja(10, 20, 30, Unidad.CM); 
            System.out.println("Caja 1: " + caja1); 
            System.out.println("Volumen de caja 1: " + caja1.getVolumen());
                Caja caja2 = new Caja(5, 10, 15, Unidad.M); 
                caja2.setEtiqueta("Caja frágil");
                System.out.println("Caja 2: " + caja2);
                System.out.println("Volumen de caja 2: " + caja2.getVolumen());
            }
    }
