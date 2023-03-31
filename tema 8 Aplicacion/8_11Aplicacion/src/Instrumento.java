
import java.util.Arrays;

public abstract class Instrumento {

    protected Nota [] melodia; // tabla que almacena las notas a interpretar
    public Instrumento() {
        melodia = new Nota[0]; //creamos la tabla
    }
    // usa el algoritmo de inserccion no ordenada
    void addNota(Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length +1); //redimensionamos
        melodia[melodia.length-1] = n; //insertamos el nuevo elemento al final
    }
    abstract void interpretar();

    
    
    

}
