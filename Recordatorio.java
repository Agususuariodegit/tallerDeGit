package aed;

public class Recordatorio {

    private String msj_;
    private Fecha fec_;
    private Horario hor_; 

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        msj_ = mensaje;
        fec_ = new Fecha(fecha.dia(),fecha.mes());
        hor_ = new Horario(horario.hora(),horario.minutos());
    }

    public Horario horario() {
        Horario horario2 = new Horario(hor_.hora(),hor_.minutos());
        return horario2;
    }

    public Fecha fecha() {
        Fecha fecha2 = new Fecha(fec_.dia(),fec_.mes());
        return fecha2;
    }

    public String mensaje() {
        return msj_;
    }

    @Override
    public String toString() {
        return msj_ + " @ " + fec_ + " " + hor_;
    }

    @Override
    public boolean equals(Object otro) {
    if (otro == null || otro.getClass() != this.getClass()){
        return false;
    }
    Recordatorio recordatorio2 = (Recordatorio) otro;
    return ((msj_ == recordatorio2.mensaje()) && (fecha().equals(recordatorio2.fecha())) && (horario().equals(recordatorio2.horario())));  
    
}
}
