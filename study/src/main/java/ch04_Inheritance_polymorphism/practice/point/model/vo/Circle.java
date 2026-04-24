package ch04_Inheritance_polymorphism.practice.point.model.vo;

public class Circle extends Point{
    // field
    int radius;

    // 생성자
    public Circle(){}
    public Circle(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }

    // getter/setter
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // 메서드
    @Override
    public String toString(){
        return super.toString() + "\n반지름 : " + radius;
    }
}
