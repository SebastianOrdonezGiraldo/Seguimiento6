package Ejercicio4;

import java.util.ArrayList;

public interface IConcesionario {ArrayList<ICar> getCars();
    void addCar(ICar car);
    boolean deleteCar(ICar car);
    void setCars(ArrayList<ICar> cars);
    String getName();
    void setName(String name);
    String getAddress();
    void setAddress(String address);
    int getNumberOfCars();
}
