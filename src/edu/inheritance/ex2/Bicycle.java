package edu.inheritance.ex2;

/**
 * Vehicle 의 자식클래스
 */
public class Bicycle extends Vehicle {
    // 필드
    private int gearCount;      // 기어 수
    private boolean isElectric; // 전기자전거 여부
    
    // 생성자
    public Bicycle() {
        super();
    }
    // 매개변수 4개 생성자
    public Bicycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }
    // 매개변수 6개 생성자
    public Bicycle(String brand, String model, int year, String color, int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    // getter, setter
    public int getGearCount() { return gearCount; }
    public boolean isElectric() { return isElectric; }
    public void setGearCount(int gearCount) { this.gearCount = gearCount; }
    public void setElectric(boolean electric) { isElectric = electric; }

    // 오버라이딩
    @Override
    public void accelerate() {
        System.out.println("자전거가 페달을 밟아 가속합니다.");
    }
    @Override
    public void brake() {
        System.out.println("자전거가 브레이크를 잡아 감속합니다.");
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("기어 수" + getGearCount());
        System.out.println("전기자전거: " + isElectric());
    }
    
    // 고유 메서드
    public void ringBell(){

    }
    public void pedal(){

    }
}
