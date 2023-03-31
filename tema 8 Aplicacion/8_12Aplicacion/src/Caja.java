


    public class Caja { 
        /*  Caja tiene cuatro variables de instancia privadas: ancho, alto, fondo y unidad 
         *  (que indica si las dimensiones se dan en centímetros o metros)
         * 
        */
        private int ancho; 
        private int alto;
        private int fondo;
        private Unidad unidad;
        //variable de instancia para la etiqueta de la caja.
        private String etiqueta;
    
        public Caja(int ancho, int alto, int fondo, Unidad unidad) {
            this.ancho = ancho; //anchura de la caja
            this.alto = alto;  //altura de la caja
            this.fondo = fondo; //fondo del caja
            this.unidad = unidad; 
        }
    
        public double getVolumen() { //El método getVolumen calcula el volumen de la caja
            double volumen = (double) ancho * alto * fondo; 
            if (unidad == Unidad.CM) { 
                volumen /= 1000000; // convertir de cm^3 a m^3
            }
            return volumen; 
        }
    
        public void setEtiqueta(String etiqueta) { 
            this.etiqueta = etiqueta; // permite cambiar el valor de la etiqueta de la caja.

        }
    
        public String toString() { 
            //devuelve una cadena que representa la caja, incluyendo sus dimensiones y etiqueta.
            return "Caja (" + ancho + "x" + alto + "x" + fondo + " " + unidad + ", etiqueta: " + etiqueta + ")"; 
        }
    }
    
    

