package ch03_class.basic.oop.model.service;

import ch03_class.basic.oop.model.vo.Apple;
import ch03_class.basic.oop.model.vo.Galaxy;
import ch03_class.basic.oop.model.vo.Phone;

public class PolyService {

    public void ex1(){
        // 다형성(한가지 타입으로 여러 객체를 만든다) 확인 예제

        // Phone 객체 생성
        Phone phone = new Phone();
    // 부모타입 참조변수 = 부모객체


        // Apple 객체 생성
        Apple apple = new Apple();
    // 자식타입 참조변수 = 자식객체

        // ************ 다형성 (업캐스팅) *************
        Phone phone2 = new Apple();
    // 부모타입 참조변수 = 자식객체
        // -> 오류 발생X
        // 왜? Apple 객체를 참조하는 변수(phone2)의 타입이
        // 부모이기 때문에 Apple 객체가 Phone 객체로 변화함

        Phone phone3 = new Galaxy();
    // 부모타입 참조변수 = 자식객체
        // Galaxy 객체를 참조하는 변수(phone3)의 타입이
        // 부모이기 때문에 Galaxy 객체가 Phone 객체로 변화함
        // 1) 자식객체가 부모객체로 변했기 때문에 자식만의 고유한 필드, 메소드 사용불가

        // 1-1) phone(부모=부모, 부모타입 참조변수로 = 부모객체 참조)
        phone.setModel("샤오미");
        phone.setColor("blue");
        // Phone 메소드 전부 사용 가능

        phone2.setModel("샤오");
        phone2.setColor("blu");
        phone3.setModel("샤");
        phone3.setColor("bl");

        // 1-2) apple(자식 = 자식)
        apple.setIosVersion("12.4");
        // Apple 메서드 사용 가능

        // 1-3) phone2(부모 = 자식(Apple))
//        phone2.setIosVersion("10.4");
        // 오류발생

        // ------------------------------------------------------------------------------------

        // 2) 다형성을 이용한 객체 배열(=객체(=전부 주소값을 가짐)들로 이루어진 배열)

        // 객체배열: 같은 참조자료형의 변수를 묶음으로 다루는 것.
        // -> 각 요소 하나하나가 참조변수(Phone이면 다 Phone 타입)

        Phone[] arr = new Phone[3];
        // 부모타입 참조변수(arr)에 배열 선언 및 할당
        // 각 배열 요소가 Phone 타입 참조변수

        // ** 다형성 적용(상속이 기본): 부모타입 참조변수로 자식객체를 참조하는 것 **
        // -> 부모 타입 참조 변수를 묶음으로 다루는 것

        arr[0] = phone;     // Phone 주소 == Phone 객체
        // 부모타입참조변수 = 부모타입참조변수(부모객체를 참조 중)

        arr[1] = phone2;    // Apple 주소 == Apple 객체
        // 부모타입참조변수 = 부모타입참조변수(자식객체를 참조 중)

        arr[2] = phone3;    // Galaxy 주소 == Galaxy 객체
        // 부모타입참조변수 = 부모타입참조변수(자식객체를 참조 중)

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+ "번째 인덱스 : " +arr[i].toString());
            arr[i].pay();
        }





    }
}
