
public class Pila extends lista {
    private lista lista;

    public Pila() {
        lista = new lista(); //creará un nuevo objeto de tipo lista y asignará su referencia a la variable lista.
    }

    void apilar(Integer elemento) { // llama al método insertarFinal del objeto lista y le pasa el parámetro elemento
        lista.insertarFinal(elemento); // El metodo insertarFinales responsable de agregar el elemento al final de la lista.
        // Por lo tanto, el método apilarse utiliza para agregar elementos al final de la lista, lo que simula el comportamiento de una pila.

    }

    Integer desapilar() {  //llama al método eliminar,del objeto lista y le pasa el índice de la última posición de la lista como argumento
        return lista.eliminar(lista.tabla.length - 1);
        /* El método eliminares responsable de eliminar el elemento de la lista en el índice proporcionado y devolverlo.
         Por lo tanto, el método desapilarse utiliza para eliminar y devolver el elemento en la parte superior de la pila.*/
    }

    public void mostrar() {
        lista.mostrar();

    }

}
