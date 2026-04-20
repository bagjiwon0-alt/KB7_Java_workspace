package ch02_conditional_loop_reference.basic.ch06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car(){
//        System.out.println(this.company);
    }
    public Car(String model){
//        System.out.println(this.company);
        this.model = model;
    }
    public Car(String model,String color){
//        System.out.println(this.company);
        this.model = model;
        this.color = color;

    }
    public Car(String model,String color,int maxSpeed){
//        System.out.println(this.company);
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
