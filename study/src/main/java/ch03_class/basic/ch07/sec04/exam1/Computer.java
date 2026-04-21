package ch03_class.basic.ch07.sec04.exam1;

public class Computer extends Calculator{
    // 메소드 선언
    @Override
    public double areaCircle(double r){
        return Math.PI * r * r;
    }
}
