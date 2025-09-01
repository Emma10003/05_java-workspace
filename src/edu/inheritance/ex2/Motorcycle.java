package edu.inheritance.ex2;

/**
 * Vehicle 의 자식클래스
 */
public class Motorcycle extends Vehicle {
    // 필드
    private int engineSize;     //배기량
    private boolean hasHelmet;  // 헬멧 착용여부
    
    // 생성자
    // 기본생성자
    public Motorcycle() {
        super();
    }
    // 매개변수 4개 생성자
    public Motorcycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }
    // 매개변수 6개 생성자
    public Motorcycle(String brand, String model, int year, String color, int engineSize, boolean hasHelmet) {
        super(brand, model, year, color);
        this.engineSize = engineSize;
        this.hasHelmet = hasHelmet;
    }
    
    // getter, setter
    public int getEngineSize() { return engineSize; }
    public boolean isHasHelmet() { return hasHelmet; }
    public void setEngineSize(int engineSize) { this.engineSize = engineSize; }
    public void setHasHelmet(boolean hasHelmet) { this.hasHelmet = hasHelmet; }

    // 오버라이딩
    @Override
    public void accelerate() {
        System.out.println("오토바이가 스로틀을 돌려 가속합니다.");
    }
    @Override
    public void brake() {
        System.out.println("오토바이가 브레이크 레버를 당겨 감속합니다.");
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("배기량: " + getEngineSize());
    }

    // 고유 메서드
    public void wheelie(){
        System.out.println(getBrand() + " " + getModel() + "이(가) 앞바퀴를 들고 윌리를 합니다!");
    }
    public void putOnHelmet(){
        System.out.println(getBrand() + " " + getModel() + "이(가) 안전을 위해 헬멧을 착용합니다.");
    }
}
