import java.util.Arrays;

public class lista {
    static Integer[] tabla;

    public lista() {
        tabla = new Integer[0]; //crear la tabla

    }

    void insertarPrincipio(Integer nuevo) { // crear una matriz nueva con una longitud que es una unidad mayor que la matriz tabla actual. 
       tabla = Arrays.copyOf(tabla, tabla.length + 1); // para poder insertar un nuevo elemento al principio de la matriz.
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo; //para copiar todos los elementos de la matriz tabla actual a la nueva matriz, comenzando desde el índice
    }

    static void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1); //para crear una matriz nueva con una longitud que es una unidad mayor que la matriz tablaactual.
        tabla[tabla.length - 1] = nuevo; // asigna el valor del parámetro nuevo al último elemento de la nueva matriz. 
    }

    void insertarFinal(lista otraLista) {
        int tamIni = tabla.length; //tamaño inicial tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length); // se hace para guardar el tamaño inicial de la matriz tabla
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length); //crear una nueva matriz con una longitud que es la suma de la longitud de la matriz tablaactual 
    }
// El primer parametro es el indice del lugar donde queremos insertar el valor del segundo parametro
    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1); //se hace para poder insertar un nuevo elemento en la posición posicionde la matriz.
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;//para copiar los elementos desde la posición hasta el final de la matriz tablaa sus posiciones

    }
// Se elimina el elemento ccorrespondiente a indice y se devuelve

    static Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) { //verifica si el índice proporcionado en el parámetro indicees válido.
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length - 1; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;

    }

//Al siguente metodo le pasaremos un indice y nos devuelvera el elemento correspondiente de la tabla sin modificarla.En el caso de que el programa aborte

    int buscar(Integer claveBusqueda) { //método llamado buscar que toma un parámetro claveBusquedade tipo Integer y devuelve un valor entero.
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {

            if (tabla[i].equals(claveBusqueda)) { //  tabla[i]==claveBusqueda
                indice = i;
            }
        }
        return indice;
    }

//El numero de elementos de la lista es el numero de elementos de la tabla

    public int numeroElementos() {
        return tabla.length;
    }

    public String mostrar() {
        return Arrays.deepToString(tabla);

    }
}

