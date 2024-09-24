package aed;

public class Fecha {
    
    private int dia_;
    private int mes_;
    
    public Fecha(int dia, int mes) { //constructor 
        dia_ = dia;
        mes_ = mes;
    }

    public Fecha(Fecha fecha) { //constructor 
        dia_ = fecha.dia();          
        mes_ = fecha.mes();
    }

    public Integer dia() {
        return dia_;
    }

    public Integer mes() {
        return mes_;
    }
    @Override
    public String toString() {
        return dia_ + "/" + mes_;
    }

    @Override
    public boolean equals(Object otra) {
        if (otra == null || otra.getClass() != this.getClass()){
            return false;
        }
        Fecha fecha2 = (Fecha) otra;
        return (dia_ == fecha2.dia() && mes_ == fecha2.mes()); 
    }

    public void incrementarDia() {
        if (diasEnMes(mes_) > dia_){
            dia_ ++;
        } 
        else if (diasEnMes(mes_) <= dia_){
            dia_ = 1;
            mes_ ++;
        if (mes_ > 12){
            mes_ = 1;
        }    
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
