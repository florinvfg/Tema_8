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
