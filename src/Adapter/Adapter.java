package Adapter;

import Car.Car;

public class Adapter implements IAdapter {

    private Car car;

    public Adapter(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        if (car.getManufacturer().getCountry().equals("US"))
            return converter(car.getSpeed());
        return car.getSpeed();
    }

    public double converter(Double speed){
        return speed*1.609344;
    }
}
