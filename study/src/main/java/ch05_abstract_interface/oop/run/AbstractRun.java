package ch05_abstract_interface.oop.run;

import ch05_abstract_interface.oop.model.service.AbstractService;
import ch05_abstract_interface.oop.model.service.Calculator;
import ch05_abstract_interface.oop.model.service.KMGCalculator;
import ch05_abstract_interface.oop.model.service.PJWCalculator;

public class AbstractRun {
    public static void main(String[] args) {
        AbstractService service = new AbstractService();
//        service.ex1();
      // -------------------------------------------------------
//        Calculator cal = new Calculator();
        // 인터페이스 == 미완성된 설계도 == 객체 생성 불가능
        // -> 추상 클래스처럼 참조 변수로는 사용 가능
//        Calculator cal = new PJWCalculator();

        Calculator cal = new KMGCalculator();

        // ********************* 인터페이스 장점, 사용 이유 **********************
        // 코드의 큰 수정 없이 객체 생성 코드만 바꾸면
        // 새로운 클래스의 코드를 수행할 수 있다.
        // *******************************************************************

        System.out.println("합 : " + cal.plus(20, 15));
        System.out.println("차 : " + cal.minus(20, 15));
        System.out.println("곱 : " + cal.multiple(20, 15));
        System.out.println("몫 : " + cal.divide(20, 15));

        // 인터페이스의 특징
        // 1) !!!!!!인터페이스를 부모 참조 변수로 사용!!!!!! 하면
        //    다형성 업캐스팅이 적용돼서
        //    상속받은 모든 클래스를 자식 객체로 참조 가능하다.

        // 2) 자식 클래스에 공통된 메서드 구현을 강제하기 때문에
        //    모든 자식 클래스가 동일한 형태를 가지게 된다.
        // -> 이를 이용하여 공동 작업(팀 프로젝트)에 필요한 개발환경 조성 가능

        // 3)
    }


}
