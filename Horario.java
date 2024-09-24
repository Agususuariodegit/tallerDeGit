package aed;

public class Horario {

    private int hora_;
    private int minutos_;

    public Horario(int hora, int minutos) {
        hora_ = hora;
        minutos_ = minutos;
    }

    public int hora() {
        return hora_;
    }

    public int minutos() {
        return minutos_;
    }

    @Override
    public String toString() {
        return hora_ + ":" + minutos_;
    }

    @Override
    public boolean equals(Object otro) {

        if (otro == null || otro.getClass() != this.getClass()){
            return false;
        }
        Horario horario2 = (Horario) otro;
        return ((hora_ == horario2.hora()) && (minutos_ == horario2.minutos()));  
    }

}
