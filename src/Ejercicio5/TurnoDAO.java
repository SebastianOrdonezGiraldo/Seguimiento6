package Ejercicio5;

import java.util.ArrayList;

public class TurnoDAO {
    private ArrayList<ITurno> turnos;

    public TurnoDAO() {
        this.turnos = new ArrayList<>();
    }
    public void addTurno(ITurno turno){
        turnos.add(turno);
    }
    public boolean deleteTurno(ITurno turno){
        return turnos.remove(turno);
    }
    public ArrayList<ITurno> getTurnos(){
        return turnos;
    }
    public void showTurnos(){
        for (ITurno turno : turnos) {
            System.out.println(turno.toString());
        }
    }
}
