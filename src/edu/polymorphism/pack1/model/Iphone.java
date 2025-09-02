package edu.polymorphism.pack1.model;

public class Iphone extends SmartPhone {

    // iOS 운영체제 버전
    private int iosVersion;

    // 기본생성자 - 객체를 생성할 때 아무런 데이터를 설정하지 않은 상태에서 공간 생성.
    public Iphone() {
    }
    // 객체를 생성할 때 iosVersion 데이터를 전달받은 후 공간 생성.
    public Iphone(int iosVersion) {
        this.iosVersion = iosVersion;
    }
    // 객체를 생성할 때 SmartPhone 필드 데이터를 전달받은 후 공간 생성.
    public Iphone(String display, String newsAgency, String ap) {
        super(display, newsAgency, ap);
    }
    // 객체를 생성할 때 SmartPhone + Iphone 필드 데이터를 전달받은 후 공간 생성.
    public Iphone(String display, String newsAgency, String ap, int iosVersion) {
        super(display, newsAgency, ap);
        this.iosVersion = iosVersion;
    }

    public int getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(int iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString() {
        // iosVersion + SmartPhone 에 작성된 toString 정보를 사용
        return "iPhone: " + iosVersion + super.toString();
    }
}
