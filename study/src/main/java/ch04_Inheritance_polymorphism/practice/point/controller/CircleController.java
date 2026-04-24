package ch04_Inheritance_polymorphism.practice.point.controller;

import ch04_Inheritance_polymorphism.practice.point.model.vo.Circle;

public class CircleController extends Circle{
    Circle c = new Circle();

    // method
    public String calcArea(int x, int y, int radius){
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double circleArea = Math.PI * c.getRadius() * c.getRadius();
        return "면적 : " + c.getX() + ", " + c.getY() + ", "  + c.getRadius() + " / " + circleArea;
    }
    public String calcCircum(int x, int y, int radius){
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double circleCircum = Math.PI * radius * 2;
        return "둘레 : " + c.getX() + ", " + c.getY() + ", "  + c.getRadius() + " / " + circleCircum;
    }
}
