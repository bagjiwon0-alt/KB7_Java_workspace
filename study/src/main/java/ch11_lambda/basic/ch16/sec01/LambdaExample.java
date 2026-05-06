package ch11_lambda.basic.ch16.sec01;

/*public class LambdaExample {
    public static void main(String[] args) {
        // 익명 클래스 사용 시
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                // x + y 계산
                int result = x + y;
                System.out.println("result : " + result);
            }
        });

        // 람다식
        // - 인터페이스 구현 코드를 한 줄 로 넘기는 문법
        // - (x, y) -> { ... }
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });

        // x - y
        action((x,y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });
    }

    // action메서드 정의
    // -> Calculable(인터페이스)을 매개변수로 받음
    public static void action(Calculable calculable) {

        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}*/


public class LambdaExample {
    public static void main(String[] args) {
        Calculable cal = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                // x + y 계산
                int result = x + y;
                System.out.println("result : " + result);
            }
        };
        cal.calculate(10,4);

        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result1 = x + y;
                System.out.println("result1 = " + result1);
            }
        });

        action((x,y) -> System.out.println("result2 = " + (x+y)));

        action((x,y) -> System.out.println("result3 = "+(x-y)));

        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println("result4 = "+(x-y));
            }
        });
    }


    public static void action(Calculable calculable){
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}