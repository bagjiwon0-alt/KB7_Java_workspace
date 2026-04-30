package ch11_lambda.basic.ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action1(new Workable() {
            @Override
            public void work(String name, String job) {
                System.out.printf("%s이 %s를 합니다",name,job);
                System.out.println();
                System.out.printf("%s이 %s를 하지 않습니다.",name,job);
                System.out.println();
            }
        });
        person.action1((name,job)->{
            System.out.printf("%s이 %s를 합니다",name,job);
            System.out.println();
            System.out.printf("%s이 %s를 하지 않습니다.",name,job);
            System.out.println();
        });

        person.action2(new Speakable() {
            @Override
            public void speak(String content) {
                System.out.printf("%s라고 말합니다.",content);
                System.out.println();
                System.out.printf("%s라고 외칩니다.",content);
                System.out.println();
            }
        });
        person.action2((content)->{
            System.out.printf("%s라고 말합니다.",content);
            System.out.println();
            System.out.printf("%s라고 외칩니다.",content);
        });
    }

}
