package ch03_class.basic.ch08.sec08;

public class SmartTelevision implements Searchable, RemoteControl {
    String url;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        this.url = url;
        System.out.println(this.url + "을 검색합니다.");
    }
}
