package edu.polymorphism.ex3.model;

public class Dog extends Animal {
    // 필드
    private String breed; // 품종
    private boolean isTrained; // 훈련 여부

    /* 메서드 */
    // 생성자
    public Dog() {
    }

    public Dog(String name, int age, String color, String type) {
        super(name, age, color, type);
    }

    public Dog(String name, int age, String color, String type, String breed) {
        super(name, age, color, type);
        this.breed = breed;
        this.isTrained = true;
    }

    // getter, setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbreed='" + breed + '\'' +
                ", isTrained=" + isTrained +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 멍멍 짖습니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 뛰어갑니다.");
    }

    @Override
    public void doSpecialAction() {
        if (isTrained) {
            System.out.println(getName() + "이(가) 앉기를 합니다!");
        } else {
            System.out.println(getName() + "은(는) 아직 훈련이 안되었습니다.");
        }
    }

    // @Override
    public void eat() {
        System.out.println(getName() + "이(가) 사료를 먹습니다.");
    }
}