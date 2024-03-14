package Ejercicio5;

import java.time.LocalTime;

public interface ITurno {
    LocalTime getHoraInicio();
    LocalTime getHoraFin();
    void setDescripcion(String descripcion);
    long getHorasTrabajadas();
    String getTipoTurno();
}
