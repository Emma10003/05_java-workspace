package edu.inheritance.ex;

public class Dog extends Animal {
    private String breed;

    // 생성자
    // 기본생성자
    public Dog() {
        // 부모클래스의 기본생성자 호출
        super(); // 기본생성자이긴 하지만, 그냥 Dog 생성자가 아닌
                 // Animal 클래스를 상속받은 상태의 생성자
    }
    /*
    Dog dog2 = new Dog();
    Animal 을 상속받은 Dog 클래스는 단독으로 기본생성자 사용 불가.
    why? ~> 암묵적으로 Animal 자체를 이미 사용하고 있다는 표기이기 때문에
    단독으로 기본생성자 사용 불가능!
    => Animal 클래스에 기본생성자를 추가해주면 사용 가능.
     */

    // 3개 매개변수 - Animal 에서 작성된 this 를 참조
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    // 4개 매개변수
    // 3개의 매개변수는 Animal 에서 작성된 this 를 참조, 1개의 매개변수는 Dog 에 작성된 필드 참조
    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    // getter, setter (breed)
    // getter : setBreed나 breed에 담겨있는 데이터를 사용할 수 있는 메서드
    public String getBreed() {
        return breed;
    }
    // setter : breed 라는 명칭으로 DB에 데이터를 저장하기 전에 사용자가 작성한 데이터를 보유하고 있는 메서드
    //          데이터를 일시적으로 보관하는 임시보관함.
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /* 메서드 */
    // 부모 메서드 - Animal 클래스에 작성된 기능을 재사용하여, Dog 클래스에서 필요한 기능으로 재탄생
    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 멍멍 짖습니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 뛰어다닙니다.");
    }

    // 고유 메서드 - Dog 클래스에서만 사용할 수 있는 기능 추가
    public void wagTail(){
        System.out.println(getName() + "이(가) 꼬리를 흔듭니다!");
    }

    public void fetch(){
        System.out.println(getName() + "이(가) 공을 물어옵니다!");
    }
}


