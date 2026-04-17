package ch01_variable_type_operator.basic.ch04.sec02;

public class Method4x5y60 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++){
            for (int y = 1; y <= 10; y++){
                int z = (x * 4) + (y * 5);
                if (z == 60) {
                    System.out.printf("(%d, %d)\n",x,y);
                }
            }
        }
    }
}
