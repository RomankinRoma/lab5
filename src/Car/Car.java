package Car;

import Manufacturer.Manufacturer;

public  class Car implements ICar {
    Manufacturer manufacturer;
    Double speed;
    String name;

    public Car(Manufacturer manufacturer, Double speed, String name) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
