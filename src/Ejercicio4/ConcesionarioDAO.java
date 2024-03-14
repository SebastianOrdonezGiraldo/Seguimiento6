package Ejercicio4;

import java.util.ArrayList;

public class ConcesionarioDAO {
    private IConcesionario concesionario;

    public ConcesionarioDAO(IConcesionario concesionario){
        this.concesionario = concesionario;
    }

    public void addCar(ICar car){
        concesionario.addCar(car);
    }

    public boolean deleteCar(ICar car){
        return concesionario.deleteCar(car);
    }

    public String getInfo(){
        return "Nombre: " + concesionario.getName() + " Dirección: " + concesionario.getAddress() + " Número de carros: " + concesionario.getNumberOfCars();
    }

    public boolean sellCar(ICar carro){
        return concesionario.deleteCar(carro);
    }

    public void showCars(){
        ArrayList<ICar> carros = concesionario.getCars();
        for (ICar carro : carros) {
            System.out.println(carro.toString());
        }

}
    public String toString() {
        return "ConcesionarioDAO" +
                "concesionario" + concesionario;
    }
}
