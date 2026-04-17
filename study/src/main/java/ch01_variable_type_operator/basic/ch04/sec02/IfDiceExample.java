package ch01_variable_type_operator.basic.ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        switch (num) {
            case 1:
                System.out.printf("%d번이 나왔습니다.", num);
                break;
            case 2:
                System.out.printf("%d번이 나왔습니다.", num);
                break;
            case 3:
                System.out.printf("%d번이 나왔습니다.", num);
                break;
            case 4:
                System.out.printf("%d번이 나왔습니다.", num);
                break;
            case 5:
                System.out.printf("%d번이 나왔습니다.", num);
                break;
            case 6:
                System.out.printf("%d번이 나왔습니다.", num);
                break;
        }

    }
}
