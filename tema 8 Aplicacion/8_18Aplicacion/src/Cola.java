
public class Cola {
    public static int length;
    private Integer[] Cola;

    public Cola() {
        super();
    }
    
    public void encolar(Integer elemento) {
        insertarFinal(elemento);
    }
    
    private void insertarFinal(Integer elemento) {
    }

    public Integer desencolar() {
        return eliminar(0);
    }
    
    protected Integer eliminar(int i) {
        return null;
    }

    public Integer frente() {
        
        if (Cola.length == 0) {
            return null;
        }
        return Cola[0];
    }
    
    public boolean estaVacia() {
        return Cola.length == 0;
    }
    
    public int tamano() {
        return Cola.length;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cola: ");
        for (int i = 0; i < Cola.length; i++) {
            sb.append(Cola[i]);
            if (i != Cola.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void apilar(int i) {
    }
}    


