package edu.polymorphism.pack2;

public class Dog extends Animal{
    private String breed;   // 견종

    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        // Animal 을 상속받는 동물들은
        // 접근제한자와 void나 자료형 사이에 존재하는
        // abstract 표시가 적힌 method 기능들을
        // 무조건 개별 class 에 맞게 재작성(Override)해야 함.
    }

    // sleep()의 경우 public과 void 사이에 abstract가 없으므로
    // 작성하지 않아도 됨. -> 필수가 아니다!

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

}
