package ch09_collection_generic.basic.ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 1. 전달받은 껍데기(o)가 Member 타입인지 확인하고,
        // 맞다면 member라는 이름으로 변신!
        // [타입 검사 & 자동 형변환]
        // o가 Member 타입인지 확인하고 맞으면 member 변수에 대입, 아니면 즉시 종료
        if (!(o instanceof Member member)) return false;
        // [논리적 동등성 비교]
        // 현재 객체(this)와 바구니에 있던 객체(member)의 필드 값이 모두 같은지 확인
        return this.age == member.age && Objects.equals(this.name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
