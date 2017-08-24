package oops;

class FlyingMachines {
    public void fly() {
        System.out.println("No implementation");
    }
}

class Jet extends FlyingMachines {
    public void fly() {
        System.out.println("Start, Taxi, Fly");
    }

    public void bombardment() {
        System.out.println("Throw Missile");
    }
}

public class PolymorphicTest {
    public static void main(String[] args) {
        FlyingMachines flm = new Jet();
        flm.fly();

        Jet j = new Jet();
        j.bombardment();
        j.fly();
    }
}