public class Cola extends lista {
    public Cola() {
        super();
    }
    
    public static void encolar(int elemento) {
        insertarFinal(elemento);
    }
    
    public static Integer desencolar() {
        return eliminar(0);
    }
    
    public Integer frente() {
        if (tabla.length == 0) {
            return null;
        }
        return tabla[0];
    }
    
    public boolean estaVacia() {
        return tabla.length == 0;
    }
    
    public int tamano() {
        return tabla.length;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cola: ");
        for (int i = 0; i < tabla.length; i++) {
            sb.append(tabla[i]);
            if (i != tabla.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}