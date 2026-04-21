package ch03_class.basic.oop.model.vo;

public class Phone {
    // field
    private String model;
    private String color;

    // 생성자
    public Phone(){
        System.out.println("Phone 기본생성자 호출");
    }

    public Phone(String model, String color){
        this.model = model;
        this.color = color;     //  this.에는 현재! 만들어진 객체값
        System.out.println("매개변수 두개짜리 생성자 실행");
    }

    // method
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 메서드(오버라이딩 설명용)
    public void pay(){
        System.out.println("결제하기 : ");
    }

    // Object.toString() 메서드 오버라이딩
    // toString() : 객체가 가지고있는 모든 값(필드)을
    //              하나의 문자열로 반환하는 용도의 메서드
    // 오브젝트의 toString을 Phone이 오버라이딩 함
    @Override
    public String toString(){
        return model + "/" + color;
    }
}
