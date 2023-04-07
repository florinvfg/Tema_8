public class Conjunto extends Lista {
    public Conjunto() {
        super();
    }
    
    @Override
    void insertarPrincipio(Integer nuevo) {
        if (!contiene(nuevo)) {
            super.insertarPrincipio(nuevo);
        }
    }
    
    @Override
    void insertarFinal(Integer nuevo) {
        if (!contiene(nuevo)) {
            super.insertarFinal(nuevo);
        }
    }
    
    @Override
    void insertarFinal(Lista otraLista) {
        for (int i = 0; i < otraLista.numeroElementos(); i++) {
            Integer nuevo = otraLista.tabla[i];
            if (!contiene(nuevo)) {
                insertarFinal(nuevo);
            }
        }
    }
    
    @Override
    void insertar(int posicion, Integer nuevo) {
        if (!contiene(nuevo)) {
            super.insertar(posicion, nuevo);
        }
    }
/*El método equals() compara si dos conjuntos tienen los mismos elementos, independientemente del orden.
 Primero comprueba si ambos objetos son iguales haciendo uso del operador == para ver si son la misma instancia.
  Después comprueba si el objeto pasado como parámetro es una instancia de la clase Conjunto. Si no lo es, retorna false.

Luego, crea una instancia del objeto Conjunto con el objeto pasado como parámetro y compara el número de elementos
 de ambos conjuntos. Si no tienen el mismo número de elementos, retorna false. En caso contrario, recorre la tabla
  del conjunto actual y comprueba si el otro conjunto contiene cada uno de los elementos. Si hay algún elemento que 
  está en uno de los conjuntos y no en el otro, retorna false. Si ha llegado al final de la tabla y todos los 
  elementos coinciden, retorna true.

Para comprobar si un conjunto contiene un elemento se utiliza el método privado contiene(), que recorre la tabla
 del conjunto buscando el elemento. Si lo encuentra, retorna true. Si llega al final de la tabla sin encontrar el
  elemento, retorna false.*/
  
    public boolean equals(Object o) { 
        if (o == this) {
            return true;
        }
        if (!(o instanceof Conjunto)) {
            return false;
        }
        Conjunto otroConjunto = (Conjunto) o;
        if (this.numeroElementos() != otroConjunto.numeroElementos()) {
            return false;
        }
        for (int i = 0; i < tabla.length; i++) {
            if (!otroConjunto.contiene(tabla[i])) {
                return false;
            }
        }
        return true;
    }
    
    private boolean contiene(Integer elemento) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conjunto: ");
        for (int i = 0; i < tabla.length; i++) {
            sb.append(tabla[i]);
            if (i != tabla.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
   }
