package ch12_stream.basic.ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        // List 컬랙션 생성
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        studentList.stream().mapToInt(item -> item.getScore()).forEach(item -> System.out.println(item));
    }
}
