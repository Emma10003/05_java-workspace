package edu.polymorphism.pack1.model;

public class Galaxy extends SmartPhone{

    // 안드로이드 운영체제 버전
    private int androidVersion;

    // html 에서 필수로 데이터 정보를 작성해야 하는 required 여부에 따라 결정되는 것이 많음.
    // 기본생성자          Galaxy 라는 객체를 생성할 때 기본적으로 갖추어야 하는 필드값 없이 생성.
    public Galaxy() {
    }
    // 매개변수 생성자     매개변수 타입 모두 SmartPhone 클래스에 작성된 필드값을 기본적으로 설정한 객체 생성.
    public Galaxy(String display, String newsAgency, String ap) {
        super(display, newsAgency, ap);
    }
    // 매개변수 생성자     매개변수 타입 SmartPhone + Galaxy 필드 값을 모두 갖춘 상태에서 객체 생성.
    public Galaxy(String display, String newsAgency, String ap, int androidVersion) {
        super(display, newsAgency, ap);
        this.androidVersion = androidVersion;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        // androidVersion + SmartPhone 에 작성된 toString 정보를 사용
        return "Galaxy: " + androidVersion + super.toString();
    }
}
