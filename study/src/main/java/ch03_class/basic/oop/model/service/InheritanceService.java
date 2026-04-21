package ch03_class.basic.oop.model.service;

import ch03_class.basic.oop.model.vo.Apple;
import ch03_class.basic.oop.model.vo.Galaxy;
import ch03_class.basic.oop.model.vo.Phone;

public class InheritanceService {
    public void ex1(){
        // 상속확인
        // - Phone을 상속받은 Apple이 Phone의 필드, 메서드 사용 가능한가?

        // 부모 - Phone
        Phone phone = new Phone();
        System.out.println(phone.getColor());
        System.out.println("----------------------------");

        // 자식 - Apple
        Apple apple = new Apple();

        // Apple만의 고유한 메소드
        apple.setIosVersion("32.1 버전");

        // 부모(Phone)로 부터 상속받은 메서드
        apple.setColor("green");

        // 세팅된 값 출력
        System.out.println(apple.getIosVersion());
        System.out.println(apple.getColor());
    }

    public void ex2(){
        // 오버라이딩 확인 예제
        // 오버라이딩(OverRiding): 부모로부터 물려받은 메소드를 자식이 재정의 하는 것.

        Galaxy galaxy = new Galaxy();

        galaxy.pay();   //  오버라이딩 X일때 -> Phone 메서드 수행
        //  ch03_class.basic.oop.model.vo.Phone(마우스 올렸을때 주소가 Phone임)

        galaxy.pay();   // 오버라이딩 O일때 -> Galaxy 메서드 수행됨
        //  ch03_class.basic.oop.model.vo.Galaxy(마우스 올렸을때 주소가 Galaxy임)
        System.out.println("--------------------------------------------------------------------");

        // toString()
        Phone phone = new Phone("아이폰24","gold");
        Apple apple = new Apple("아이폰Xs", "gray" , "3버전");

        System.out.println(phone.toString());
        // 오버라이딩 전에는 Object거였음.

        System.out.println(apple);   // 애플에는 ios필드도 있는데 phone걸로 그대로 하면 ios는 안나오니까 또 오버라이딩 해야지
        // 프린트 수행시 참조변수(주소)명만 작성하는 경우:
        // 자동으로 toString() 메서드 호출해서 출력

    }

    public void ex3(){
        Galaxy g = new Galaxy();

    }
}
