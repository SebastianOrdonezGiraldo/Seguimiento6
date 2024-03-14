package Ejercicio5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AbstractTurno implements ITurno{
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String descripcion;

    public AbstractTurno(LocalTime horaInicio, LocalTime horaFin, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }
    @Override
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    @Override
    public LocalTime getHoraFin() {
        return horaFin;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public long getHorasTrabajadas() {
        return ChronoUnit.HOURS.between(horaInicio, horaFin);
    }
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String getTipoTurno() {
        LocalTime medioDia = LocalTime.of(12, 0);
        if (horaInicio.isBefore(medioDia)) {
            return "Turno de día";
        } else {
            return "Turno de tarde";
        }
    }
}
