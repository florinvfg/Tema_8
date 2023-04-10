public class ColaDoble extends Cola {
    private static final Object[] Cola = null;

    public ColaDoble() {
        super();
    }
    
    public void encolarPrincipio(Integer elemento) {
        insertarPrincipio(elemento);
    }
    
    private void insertarPrincipio(Integer elemento) {
    }

    public Integer desencolarFinal() {
        
        if (Cola.length == 0) {
            return null;
        }
        return eliminar(Cola.length - 1);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cola Doble: ");
        for (int i = 0; i < Cola.length; i++) {
            sb.append(Cola[i]);
            if (i != Cola.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
