package ch01_variable_type_operator.basic.ch04.sec02;

public class ReverseFiveStars {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i-- ) {
            String sum = "";
            for ( int j = i; j != 0 ; j--){
                sum = sum + "*";
            }
            System.out.println(sum);
        }
    }
}


