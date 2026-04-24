package ch04_Inheritance_polymorphism.practice.point.controller;

import ch04_Inheritance_polymorphism.practice.point.model.vo.Rectangle;

public class RectangleController {
    Rectangle r = new Rectangle();

    // method
    public String calcArea(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);
        double RectangleArea = r.getHeight() * r.getWidth();
        return "면적 : " + r.getX() + ", " + r.getY() + ", " + r.getHeight() + ", " + r.getWidth() + " / " + RectangleArea;
    }

    public String calcPerimeter(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);
        double RectanglePerimeter = 2 * (r.getHeight() + r.getWidth());
        return "면적 : " + r.getX() + ", " + r.getY() + ", " + r.getHeight() + ", " + r.getWidth() + " / " + RectanglePerimeter;

    }
}
