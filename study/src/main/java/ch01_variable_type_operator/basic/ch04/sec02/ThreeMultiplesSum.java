package main.java.ch01_variable_type_operator.basic.ch04.sec02;

public class ThreeMultiplesSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.printf("1부터 100까지 정수 중 3의 배수의 총합: %d", sum);
    }
}
