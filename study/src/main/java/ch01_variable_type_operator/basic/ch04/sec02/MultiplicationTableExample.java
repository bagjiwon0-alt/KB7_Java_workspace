package ch01_variable_type_operator.basic.ch04.sec02;

public class MultiplicationTableExample {
    public static void main(String[] args) {

        for (int i = 2; i <=9; i++) {
                System.out.printf("*** %d단 ***\n",i);
            for (int j = 1; j <= 9; j++) {
                int times = i * j;
                System.out.printf("%d x %d = %d\n",i, j, times);
            }
        }
    }
}
