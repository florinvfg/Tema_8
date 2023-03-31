import java.util.Arrays;

public class Lista {
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }
    
    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }
    
    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }
    
    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length; //tamaño inicial tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length); 
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length); 
    }
    
    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    
    }
    
    Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length - 1; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    
    }
    
    int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
    
            if (tabla[i].equals(claveBusqueda)) { // no vale tabla[i]==claveBusqueda
                indice = i;
            }
        }
        return indice;
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;

        }
    
        if (!(obj instanceof Lista)) {
            return false;
        }
        
        Lista otraLista = (Lista) obj;
    
        if (tabla.length != otraLista.tabla.length) {
            return false;
            
        }
    
        for (int i = 0; i < tabla.length; i++) {
            if (!tabla[i].equals(otraLista.tabla[i])) {
                return false;
                
                
            }
        }
    
         
  
        return true;
    }
     public int numeroElementos() {
        return tabla.length;
    }
    
    public String toString() {
        return "Lista: " + Arrays.toString(tabla);
    }
}

