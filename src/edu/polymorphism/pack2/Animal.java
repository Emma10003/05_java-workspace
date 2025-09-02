package edu.polymorphism.pack2;

/**
 * 부모클래스
 */
public abstract class Animal {
    // 필드
    protected String name;

    // 생성자
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    // getter, setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 먹고 자는 행위는 무조건 함!
    // 추상화를 통해 자식클래스에 무조건 아래 메서드가 오버라이드 되도록 하기!
    //      => public "abstract" void eat();
    // 추상메서드는 중괄호{} 작성하지 않음.
    // 추상메서드를 사용하기 위해서는 클래스도 추상클래스로 만들어야 함. (public "abstract" class Animal)
    public abstract void eat();
    public void sleep(){};

    // eat sleep 을 상속받는 Dog에서 작성하지 않아도 아무런 문제가 되지 않음!! ~> 이 점이 문제가 됨
    // public void eat() {};
    // public void sleep() {};
}
