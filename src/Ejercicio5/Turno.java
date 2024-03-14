package Ejercicio5;

import java.time.LocalTime;

public class Turno extends AbstractTurno{
    public Turno(LocalTime horaInicio, LocalTime horaFin, String descripcion) {
        super(horaInicio, horaFin, descripcion);
    }@Override
    public String toString() {
        return getDescripcion();
    }

}
