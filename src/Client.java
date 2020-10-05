import Adapter.Adapter;
import Car.*;
import Manufacturer.*;


public class Client {
    public static void main(String[] args) {
        Car sedan=new Sedan(new Europe(),512.0,"Audi");
        Car miniven=new Miniven(new US(),512.0,"BMW");
        Car lSportCar=new Miniven(new Europe(),512.0,"Porche");
        Car lSportCar2=new Miniven(new US(),512.0,"Lamborgini");
        Adapter adapterMiniven = new Adapter(miniven);
        Adapter adapterLSCar = new Adapter(lSportCar);
        Adapter adapterLSCar2 = new Adapter(lSportCar2);
        System.out.println(sedan.getSpeed());
        System.out.println(adapterMiniven.getSpeed());
        System.out.println(adapterLSCar.getSpeed());
        System.out.println(adapterLSCar2.getSpeed());
    }
}
