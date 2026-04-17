package ch01_variable_type_operator.basic.ch04.sec02;

public class FiveStars {
    public static void main(String[] args) {
        String sum = "*";
        for (int i = 1; i <= 5; i++ ) {
            System.out.println(sum);
            sum = sum + "*";
        }
    }
}
