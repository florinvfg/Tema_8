/*  8.13
La empresa de mensajeria BiciExpress,que reparte en bicicleta,para disminuir el peso que transportan sus empleados solo 
utiliza cajas de carton.El volumen de estas se calcula como 80% del volumen real,con el fin de evitar que se deformen y se rompan.
Otra caracteristicas de las cajas de carton es que sus medidas siempre estan en centimetros.Por ultimo,la empresa,para controlar 
costes,necesita saber cual es la superficie total de carton utilizado para construir todas las cajas.
Escribe la clase CajaCarton heredando de la clase Caja.

 */

public class Main {
    public static void main(String[] args) {
        CajaCarton caja1 = new CajaCarton(10, 20, 30, Unidad.CM);
        System.out.println("Caja 1: " + caja1);
        System.out.println("Volumen de caja 1: " + caja1.getVolumen());
        CajaCarton caja2 = new CajaCarton(5, 10, 15, Unidad.M);
        caja2.setEtiqueta("Caja frágil");
        System.out.println("Caja 2: " + caja2);
        System.out.println("Volumen de caja 2: " + caja2.getVolumen());
        System.out.println("El consumo de carton es " + (caja1.getSuperficieTotal() + caja2.getSuperficieTotal()) + " cm cuadrados ");
    }
}
