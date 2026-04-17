package ch02_conditional_loop_reference.basic.ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자가용");
//        System.out.println("car2.model : " + model);

        Car car3 = new Car("자가용","빨강");
        Car car4 = new Car("택시","검정",200);
    }
}
