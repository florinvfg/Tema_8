
public class Pila {

    public static Pila p;
    private lista lista;

    public Pila() {
        lista = new lista();
    }

    void apilar(Integer elemento) {
        lista.insertarFinal(elemento);
    }

    Integer desapilar() {
        return lista.eliminar(lista.tabla.length - 1);
    }

   /* public void mostrar() {
        lista.mostrar();

    }
*/
}
