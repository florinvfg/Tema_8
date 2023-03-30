

public class HoraExacta extends Hora { //hereda de Hora
    //resto de la implementacion de la clase Hora
    /*Reimplentaremos (overriding)el metodo equals() heredado de la clase Object,
    para comparar dos horas,que seran iguales si sus horas,minutos y segundos son iguales.
    La hoora con la que tenemos que comparar se pasa como un objeto de la clase Object,que
    tendremos que convertir (cast) a HoraExacta.
     * 
     */
    @Override
    public boolean equals(Object o) { 
        HoraExacta otroReloj = (HoraExacta) o; /*el mismo objeto esta referenciado 
        como Object (con el parametro o) y como HoraExacta (con la variable otroReloj).*/
        boolean iguales;
        if (this.hora == otroReloj.hora //si las horas son iguales 
        && this.minutos == otroReloj.minutos //y los minutos son iguales
        && this.segundos == otroReloj.segundos ) {//y los segundos son iguales
            iguales = true; //son iguales
        } else {
            iguales = false; //no son iguales
        }
        return iguales;
    }

}