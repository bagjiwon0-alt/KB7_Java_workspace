package ch03_class.basic.sec07.exam01.run;

import ch03_class.basic.sec07.exam01.service.ClsService;
import ch03_class.basic.sec07.exam01.vo.Student;

public class ClsRun {   // 실행용 클래스
    public static void main(String[] args) {
        Student std = new Student();

        // Student의 ex메서드 호출
//        std.ex();

        ClsService service = new ClsService();
//        service.ex1();    //  접근제한자 예제 확인
//        service.ex2();      // static 예제 확인
            service.ex3();




    }
}
