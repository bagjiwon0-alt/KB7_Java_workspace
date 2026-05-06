package ch11_lambda.basic.ch16.sec04;

public class LambdaExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(new Calculable() {
            @Override
            public double calc(double x, double y) {
                double result1 = x + y;
                return result1;
            }
        });

        person.action((x, y) -> x+y);

        person.action((x, y) -> sum(x,y));
    }

    public static double sum(double x , double y){
        return (x+y);
    }
}
