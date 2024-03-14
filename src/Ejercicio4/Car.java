package Ejercicio4;

public class Car extends AbstractCar{
    public Car(String model,String make, int year){
        super(model, make, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", make='" + getMake() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
