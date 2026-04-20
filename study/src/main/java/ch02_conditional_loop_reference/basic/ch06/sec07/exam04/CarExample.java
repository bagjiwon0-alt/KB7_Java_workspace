package ch02_conditional_loop_reference.basic.ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자가용");
//        System.out.println("car2.model : " + model);
        Car car3 = new Car("자가용","빨강");
        Car car4 = new Car("택시","검정",200);

        System.out.println("car1.company : " + car1.company);
        System.out.println();
        System.out.println("car2.company : " + car1.company);
        System.out.println("car2.company : " + car2.model);
        System.out.println();
        System.out.println("car3.company : " + car1.company);
        System.out.println("car3.company : " + car3.model);
        System.out.println("car3.company : " + car3.color);
        System.out.println();
        System.out.println("car4.company : " + car1.company);
        System.out.println("car4.company : " + car4.model);
        System.out.println("car4.company : " + car4.color);
        System.out.println("car4.company : " + car4.maxSpeed);


    }
}
