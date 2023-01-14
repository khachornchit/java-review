package src.Core.Java8Review.Java804_DefaultMethod;

public class DefaultMethod {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }

    interface Vehicle {

        default void print() {
            System.out.println("I am a vehicle!");
        }

        static void blowHorn() {
            System.out.println("Blowing horn!!!");
        }
    }

    interface FourWheeler {

        default void print() {
            System.out.println("I am a four wheeler!");
        }
    }

    static class Car implements Vehicle, FourWheeler {
        @Override
        public void print() {
            Vehicle.super.print();
            FourWheeler.super.print();
            Vehicle.blowHorn();
            System.out.println("I am a car!");
        }
    }
}
