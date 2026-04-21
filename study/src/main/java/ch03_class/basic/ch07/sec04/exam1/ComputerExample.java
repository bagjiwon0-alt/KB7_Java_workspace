package ch03_class.basic.ch07.sec04.exam1;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Computer com = new Computer();

        System.out.println(cal.areaCircle(5.1));
        System.out.println(com.areaCircle(5.1));
    }
}
