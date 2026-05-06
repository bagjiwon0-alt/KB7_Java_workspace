package ch11_lambda.basic.ch16.sec01;

public class LambdaExample2 {
    public static void main(String[] args) {
        action(new Calculable2() {
            @Override
            public void calculate(int x, int y) {
                System.out.println((x+y));
            }
        });
        action(((x, y) -> System.out.println((x+y))));
        action(new Calculable2() {
            @Override
            public void calculate(int x, int y) {
                System.out.println((x-y));
            }
        });
        action((x,y)-> System.out.println((x-y)));
    }

    public static void action(Calculable2 calculable){
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}
