package ch02_conditional_loop_reference.basic.ch06.sec07.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("자가용");
        Car car1 = new Car("자가용");
        Car car2 = new Car("자가용", "빨강");
        Car car3 = new Car("택시", "검정",200);


        System.out.println("car1.company : "+Car.company);
        System.out.println();
        System.out.println("car2.company : "+Car.company);
        System.out.println("car2.model : " + car1.model);
        System.out.println();
        System.out.println("car3.company : "+Car.company);
        System.out.println("car3.model : " + car2.model);
        System.out.println("car3.color : " + car2.color);
        System.out.println();
        System.out.println("car4.company : "+Car.company);
        System.out.println("car4.model : " + car3.model);
        System.out.println("car4.color : " + car3.color);
        System.out.println("car4.maxSpeed : " + car3.maxSpeed);


    }
}
