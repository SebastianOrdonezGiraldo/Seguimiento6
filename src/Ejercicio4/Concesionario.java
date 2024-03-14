package Ejercicio4;

import java.util.ArrayList;

public class Concesionario implements IConcesionario{
    private String name;
    private String address;
    private ArrayList<ICar> cars;

    public Concesionario(String name, String address) {
        this.name = name;
        this.address = address;
        this.cars = new ArrayList<>();
    }

    @Override
    public ArrayList<ICar> getCars() {
        return cars;
    }

    @Override
    public void addCar(ICar car) {
    cars.add(car);
    }

    @Override
    public boolean deleteCar(ICar car) {
        return cars.remove(car);
    }

    @Override
    public void setCars(ArrayList<ICar> cars) {
    this.cars = cars;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
    this.address = address;
    }

    @Override
    public int getNumberOfCars() {
        return 0;
    }
}
