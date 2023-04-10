import java.util.Calendar;

public class Calendario {
        protected int año;
        protected int mes;
        private int dia;
    
        public Calendario(int año, int mes, int dia) {
            if (mes < 1 || mes > 12 || dia < 1 || dia > diasEnMes(mes, año)) {
                throw new IllegalArgumentException("Fecha incorrecta");
            }
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        }
    
        private int diasEnMes(int mes, int año) {
            int[] diasEnMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return diasEnMeses[mes];
        }
    
        public void incrementarDia() {
            int ultimoDiaEnMes = diasEnMes(mes, año);
            if (dia < ultimoDiaEnMes) {
                dia++;
            } else {
                dia = 1;
                incrementarMes();
            }
        }
    
        public void incrementarMes() {
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                incrementarAño(1);
            }
        }
    
        public void incrementarAño(int cantidad) {
            año += cantidad;
        }
    
        public void mostrar() {
            System.out.printf("%d/%d/%d\n", dia, mes, año);
        }
    
        public boolean iguales(Calendario otraFecha) {
            return año == otraFecha.año && mes == otraFecha.mes && dia == otraFecha.dia;
        }

        public static Calendar getInstance() {
            return null;
        }
    }
    


