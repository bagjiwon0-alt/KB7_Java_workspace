package ch12_stream.basic.ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        Stream<String> distinctStream = list.stream().distinct();
        distinctStream.forEach(item -> System.out.println(item));
        System.out.println();

        list.stream().filter(item -> item.startsWith("신")).forEach(item -> System.out.println(item));
        System.out.println();
        list.stream().distinct().filter(item->item.startsWith("신")).forEach(item-> System.out.println(item));
    }
}
