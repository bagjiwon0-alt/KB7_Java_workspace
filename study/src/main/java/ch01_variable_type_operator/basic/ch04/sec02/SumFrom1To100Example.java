package ch01_variable_type_operator.basic.ch04.sec02;

public class SumFrom1To100Example {
    public static void main(String[] args) {
            int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        };
        System.out.printf("1~100 합 : %d",sum);
    }
}
