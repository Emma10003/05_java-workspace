package edu.inheritance.ex2;

/**
 * Vehicle 의 자식클래스
 */
public class Car extends Vehicle {
    // 필드
    private String fuelType;    // 연료 타입
    private int doors;          // 문 개수

    // 생성자
    public Car() {
        super();
    }
    // 매개변수 4개 생성자
    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }
    // 매개변수 6개 생성자
    public Car(String brand, String model, int year, String color, String fuelType, int doors) {
        super(brand, model, year, color);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    // getter, setter
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }

    // 오버라이딩
    @Override
    public void accelerate() {
        System.out.println("자동차가 액셀러레이터를 밟아 가속합니다.");
    }
    @Override
    public void brake() {
        System.out.println("자동차가 브레이크를 밟아 감속합니다.");
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("연료 타입: " + getFuelType());
        System.out.println("문 개수: " + getDoors());
    }

    // 고유 메서드
    public void honk(){
        System.out.println(getBrand() + " " + getModel() + "이(가) 빵빵! 경적을 울립니다.");
    }
    public void openTrunk(){
        System.out.println(getBrand() + " " + getModel() + "이(가) 트렁크를 엽니다.");
    }


}
