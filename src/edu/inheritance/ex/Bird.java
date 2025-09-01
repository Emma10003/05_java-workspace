package edu.inheritance.ex;

public class Bird extends Animal {
    private double wingspan;

    // 생성자
    // 기본생성자
    public Bird() {
    }
    // 3개 매개변수
    public Bird(String name, int age, String color) {
        super(name, age, color);
    }
    // 4개 매개변수
    public Bird(String name, int age, String color, double wingspan) {
        super(name, age, color);
        this.wingspan = wingspan;
    }

    // getter, setter (wingspan)
    // getter - set 이나 wingspan 에 저장된 데이터를 사용할 수 있는 기능
    public double getWingspan() {
        return wingspan;
    }
    // setter - DB에 저장하기 전에 임시로 데이터를 보유하고 있는 기능
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    /* 메서드 */
    // 부모 메서드
    // public void eat() {
    //     super.eat();
    // }
    //
    // public void sleep() {
    //     super.sleep();
    // }

    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 짹짹 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 날아다닙니다.");
    }

    // 고유 메서드 - Bird 에서만 사용할 수 있는 기능들
    public void fly(){
        System.out.println(getName() + "이(가) 높이 날아오릅니다!");
    }

    public void buildNest(){
        System.out.println(getName() + "이(가) 둥지를 만듭니다!");
    }
}
