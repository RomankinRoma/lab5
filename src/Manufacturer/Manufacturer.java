package Manufacturer;

public abstract class Manufacturer implements IManufacturer {
    String name;

    public Manufacturer(String name) {
        this.name = name;
    }

    @Override
    public String getCountry() {
        return name;
    }
}
