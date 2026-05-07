package ch12_stream.basic.ch17.sec04.exam03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; // 합계를 구하기 위한 변수

    public static void main(String[] args) {
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length ; i++) {
            intArray[i] = i+1;
        }

       /* for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }*/

        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> sum += item);

        System.out.println("총합: " +sum);

    }

}
