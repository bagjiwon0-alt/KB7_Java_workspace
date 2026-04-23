package ch05_abstract_interface.oop.model.vo;

public class Fish extends Animal{
    // 인터페이스 상속받을때: implements
    // 클래스 상속받을때: extends

    // Animal의 추상 메서드를 오버라이딩 하지 않으면 오류 발생함.

    @Override
    public void eat() {
        System.out.println("뻐끔 거리며 먹는다.");
    }

    @Override
    public void breath() {
        System.out.println("아가미 호흡");
    }
}
