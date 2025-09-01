package edu.inheritance.ex1;
/*
public class Cat extends Animal { // 이 줄에 빨간줄이 생기는 경우
    // 생성자를 만들어주지 않았기 때문에 빨간줄 에러 발생.
    // 상속의 경우, '부모에 작성된 필드와 생성자를 활용하겠다'는 게 기본 정의.
    // 따라서 부모의 필드를 활용할 수 있는 생성자가 존재하지 않을 때 문제가 발생한다.
 */
public class Cat extends Animal {
    // 필드 (=속성, 인스턴스 변수)
    private boolean isIndoor;

    // 기본생성자
    public Cat(){
        super();
    }
    // 3개 매개변수
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
    // 4개 매개변수 - Animal 3개 + Cat 1개
    public Cat(String name, int age, String color, boolean isIndoor) {
        super(name, age, color);
        this.isIndoor = isIndoor;
    }

    // getter, setter (isIndoor)
    public boolean isIndoor() { // 앞에 is가 붙으면 get 생략.
        // is와 get 둘 다 동사라서 is를 사용
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    /* 메서드 */
    // 부모 메서드
    @Override
    public void makeSound() {
        // Animal 에 작성된 이름이 private -> Animal 클래스에서만 사용할 수 있는 명칭이므로
        // getName()을 활용해서 setName()에 담겨져 있는 데이터를 사용해야 함.
        System.out.println(getName() + "이(가) 야옹 웁니다.");
    }
    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 조용히 걸어다닙니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("실내묘: " + isIndoor());
    }

    // 고유 메서드 - Cat 클래스에서만 사용할 수 있는 기능들
    public void purr(){
        System.out.println(getName() + "이(가) 골골 소리를 냅니다!");
    }

    public void scratch(){
        System.out.println(getName() + "이(가) 발톱으로 긁습니다.");
    }
}
