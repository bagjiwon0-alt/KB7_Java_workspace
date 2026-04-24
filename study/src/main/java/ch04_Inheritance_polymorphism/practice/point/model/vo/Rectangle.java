package ch04_Inheritance_polymorphism.practice.point.model.vo;

public class Rectangle extends Point{
    // 필드
    int width;
    int height;

    // 생성자
    public Rectangle(){}
    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    // getter/setter
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // 메서드
    public String toString(){
        return super.toString() + "\n높이 : " + height + "\n너비 : " + width;
    }
}
