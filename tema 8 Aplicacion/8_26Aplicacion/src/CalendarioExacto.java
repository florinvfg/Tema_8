import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarioExacto extends Calendario{ 
     public CalendarioExacto(int año, int mes, int dia) {
        super(año, mes, dia);
        //TODO Auto-generated constructor stub
    }


    
    private int dia;
    private int hora;
    private int minuto;
    
    // Constructor que toma los valores de año, mes, día, hora y minuto
    public void CalendarioExacto(int año, int mes, int dia, int hora, int minuto) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }
    
    // Métodos getter para cada atributo
    public int getAño() {
        return año;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    // Métodos setter para cada atributo
    public void setAño(int año) {
        this.año = año;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    // Método que devuelve una representación en String de la fecha y hora exactas
    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d", año, mes, dia, hora, minuto);
    }
    
    // Método que compara dos objetos CalendarioExacto y devuelve true si son iguales
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CalendarioExacto)) {
            return false;
        }
        CalendarioExacto otro = (CalendarioExacto) obj;
        return año == otro.año && mes == otro.mes && dia == otro.dia && hora == otro.hora && minuto == otro.minuto;
    }
   
}


    
        