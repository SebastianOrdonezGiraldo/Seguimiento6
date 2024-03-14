package Ejercicio4;

public abstract class AbstractCar implements ICar {
    private String model;
    private String make;
    private int year;

    public AbstractCar(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
    this.year= year;
    }
}
