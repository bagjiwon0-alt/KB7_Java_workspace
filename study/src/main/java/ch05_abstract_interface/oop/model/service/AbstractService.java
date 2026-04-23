package ch05_abstract_interface.oop.model.service;

import ch05_abstract_interface.oop.model.vo.Animal;
import ch05_abstract_interface.oop.model.vo.Fish;
import ch05_abstract_interface.oop.model.vo.Person;

public class AbstractService {
    public void ex1(){
        // 추상 클래스를 객체로 만들 수 있을까? X
//        Animal animal = new Animal();   // 'Animal'은(는) abstract이며, 인스턴스화할 수 없습니다
        // -> 객체화 불가

        // 클래스      : 객체의 속성(필드)과 기능(메서드)을 정의한 것(설계도)
        // 추상 클래스  : 미완성된 메서드를 포함한 클래스, 미완성된 설계도
        //              -> 미완성된 설계도로는 객체를 만들 수 없다

        // 해결 방법 : Animal을 상속받아 미완성 부분을 구현한 클래스를 이용해 객체 생성해야함.

        // * 추상 클래스를 상속 받은 자식 객체 생성
        Person p1 = new Person();

        p1.setName("홍길동");

        // 상속받은 기능 호출
        p1.setType("척추동물");
        p1.setEatType("사람은 잡식이다.");

        // 오버라이딩한 메서드 호출
        p1.eat();
        p1.breath();

    }
}
