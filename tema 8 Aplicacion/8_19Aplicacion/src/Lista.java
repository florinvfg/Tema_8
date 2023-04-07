import java.util.Arrays;
/*Implementamos las listas con tabla de tipo Integer,que iremos
redimensionado segun vaya haciendo falta.El indice de un elemento
en la lista coincide con el indice de lugar que ocupa en la tabla.
*/

public class Lista {
Integer[] tabla;
public Lista() {
    tabla = new Integer[0];
}
void insertarPrincipio(Integer nuevo) {
    tabla = Arrays.copyOf(tabla, tabla.length +1);
    System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1); //System.arraycopy(origen, inicio_origen, destino, inicio_destino, longitud);

    tabla[0] = nuevo;
}
void insertarFinal(Integer nuevo) {
    tabla = Arrays.copyOf(tabla, tabla.length +1);
    tabla[tabla.length - 1] = nuevo;

}
void insertarFinal(Lista otraLista){
    int tamIni = tabla.length; //tamaño inicial tabla
    tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
    System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
}
/*El primer parametro es el indice del lugar donde queremos insertar el valor del
 * segundo parametro
 */
void insertar(int posicion, Integer nuevo) {
    tabla = Arrays.copyOf(tabla, tabla.length + 1);
    System.arraycopy (tabla, posicion, tabla, posicion + 1,tabla.length - posicion - 1 );
    tabla[posicion] = nuevo;
    
}
/*Se elimina el elemento correspondiente a indice y se devuelve */
Integer eliminar(int indice) {
    Integer eliminado = null;
if (indice >= 0 && indice < tabla.length) {
    eliminado = tabla[indice];
  for (int i = indice + 1; i < tabla.length; i++) {
    tabla[i - 1] = tabla[i];
  }
  tabla = Arrays.copyOf(tabla, tabla.length - 1);
}
   return eliminado;
}
/*Al siguiente metodo le pasaremos un indice y nos devolvera el elemento corespondiente de
 * la tabla sin modificarla.En el caso de que el indice no sea valido,devolvera nul,con lo
 *  cual evitamos que el programa aborte
 */
Integer get (int indice) {
    Integer resultado = null;
    if (indice >= 0 && indice < tabla.length) {//indice valido
    resultado = tabla[indice];
}
return resultado;
}
int buscar(Integer claveBusqueda) {
    int indice = -1;
    for (int i = 0; i < tabla.length && indice == -1; i++) {
        if (tabla[i].equals(claveBusqueda)) {//no vale tabla[i]==claveBusqueda
        indice = i;
    }
  }
  return indice;
}
/*El numero de elementos de la lista es el numero de elementos de la tabla
 */
public int numeroElementos() {
    return tabla.length;
}
//Muestra por consola el contenido de la lista
public void mostrar() {
    System.out.println(" Lista: " + Arrays.toString(tabla));

  }
}