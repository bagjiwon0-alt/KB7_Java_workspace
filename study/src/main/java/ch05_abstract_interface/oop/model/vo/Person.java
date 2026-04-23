package ch05_abstract_interface.oop.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 매개변수 생성자
@Getter
@Setter
public class Person extends Animal{
    // 필드
    private String name;

    // 생성자
    public Person(){
        super();        // == Animal 기본 생성자
        // 생략시 컴파일러가 추가
    }

    // 메서드
    // 추상 메서드는 상속 받으면 오버라이딩이 강제된다!!!!!!!!!!!!!
    @Override
    public void eat() {
        System.out.println("숟가락, 젓가락을 이용해 먹는다.");
    }

    @Override
    public void breath() {
        System.out.println("코나 입으로 숨쉰다");
    }
}
