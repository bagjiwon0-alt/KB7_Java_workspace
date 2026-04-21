package ch03_class.basic.oop.model.vo;

public class Apple extends Phone{
    // Apple 클래스에 Phone 클래스의 내용을 확장/연장한다.
    // == Apple 클래스에 Phone 클래스의 내용(field, method)을 추가하여 확장.

    // 속성
    private String iosVersion;

    // 생성자
    public Apple() {
    }

    public Apple(String model, String color, String iosVersion){
        // 전달받은 값(= 매개변수) 중 model, color는 부모 객체 필드에 세팅해야함

//         this.model = model;
        // 상속받은 부모의 필드(model)를 자식의 필드처럼 사용하려 했으나 오류 발생

        // 왜? 부모 필드에 private 접근 제한자를 썼기 때문에
        // 물려받은 자식이어도 직접 접근 불가
        // ==>> 갑접 접근 방법 사용
        // (부모객체의 필드는 private인데 method(getter&setter)는 public으로 돼있어서 사용가능)
//        setModel(model);
//        setColor(color);
        // -> 부모의 setter를 이용하면 되지만 비효율적임

        // super : 상위 <-> sub : 하위
        // super == Phone
        // 반드시 자식 생성자 최상단에 작성돼야 함.
        super(model, color);        // super() : 생성자
        this.iosVersion = iosVersion;

        System.out.println("Apple 생성자 실행");

    }

    // 메서드
    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString(){
//        return super.toString() + "/" + iosVersion;
//        return getModel() + "/" + getColor() + "/" + iosVersion;
        return super.toString() + "/" + iosVersion;     // super. : 참조변수(주소)
    }
}
