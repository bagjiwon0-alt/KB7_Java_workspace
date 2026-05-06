package ch11_lambda.basic.ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

/*        Member m1 = person.getMember1(new Creatable1() {
            @Override
            public Member create(String id) {
                return new Member(id);
            }
        });*/
        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);

        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}
