
public class CajaCarton extends Caja {
    private static final double PORCENTAJE_VOLUMEN_REAL = 0.8;
    
    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, Unidad.CM);
    }
    
    @Override
    public double getVolumen() {
        return super.getVolumen() * PORCENTAJE_VOLUMEN_REAL;
    }
    
    public double getSuperficieTotal() { //el método getSuperficieTotal() para calcular la superficie total de cartón
        double superficie = 0;
        superficie += (2 * getAreaFrontal());
        superficie += (2 * getAreaLateral());
        superficie += (2 * getAreaSuperior());
        return superficie;
    }
    
    public double getAreaFrontal() { //el método getAreaFrontal() para calcular el area frontal de cartón
        return getAncho() * getAncho();
    }
    
    public int getAncho() {
        return ancho;
    }

    public double getAreaLateral() { // para calcular area lateral
        return getFondo() * getAlto();

    }
    
    public int getFondo() {
        return fondo;
    }

    public double getAreaSuperior() { // para calcular area superior
        return getAncho() * getFondo();
    }
    public int getAlto() {
        return alto;

    }
}
