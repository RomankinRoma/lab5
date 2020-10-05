import Adapter.Adapter;
import Car.*;
import Manufacturer.*;


public class Client {
    public static void main(String[] args) {
        Car sedan=new Sedan(new Europe(),512.0,"Audi");
        Car miniven=new Miniven(new US(),512.0,"Audi");
        Adapter adapterMiniven = new Adapter(miniven);
        Adapter adapterSedan = new Adapter(sedan);
        System.out.println(adapterSedan.getSpeed());
        System.out.println(adapterMiniven.getSpeed());
    }
}
