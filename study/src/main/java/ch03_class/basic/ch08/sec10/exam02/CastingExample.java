package ch03_class.basic.ch08.sec10.exam02;

public class CastingExample extends Bus{
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }

}

