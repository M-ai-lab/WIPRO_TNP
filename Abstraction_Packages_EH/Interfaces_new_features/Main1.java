package Abstraction_Packages_EH.Interfaces_new_features;

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {
        Vehicle.super.message();
    }
}

public class Main1{
    public static void main(String[] args) {
        Car c = new Car();
        c.message();
    }
}