package ch12_stream.basic.ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동",30));
        studentList.add(new Student("신용권",10));
        studentList.add(new Student("유미선",20));

        IntStream intStream = studentList.stream().mapToInt(student -> student.getScore());

    }
}
