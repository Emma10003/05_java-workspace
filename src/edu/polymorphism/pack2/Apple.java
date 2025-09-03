package edu.polymorphism.pack2;

/**
 * 부모 클래스로 Fruit 상속을 받으려면
 * extends 부모클래스명
 *
 * 클래스 'Apple'은(는) abstract로 선언되거나 'Fruit'에서 추상 메서드 'taste()'을(를) 구현해야 합니다
 * => Fruit 부모클래스에 작성된
 *    public abstract void taste();
 *    를 Apple 자식클래스에서 자식클래스 형식에 맞게 기능을 수정하여 작성하지 않아서 발생하는 문제.
 *
 * 그런데
 * public void info(){} 의 경우에는 public 과 void 사이에 abstract 가 존재하지 않아
 * Apple 클래스에서 재설정하지 않아도 문제가 발생하지 않음.
 *
 * 'abstract' : 이게 붙은 메서드는 자식클래스에서 자식클래스에 맞게 다시 작성해야함을 표기한 것!
 */
public class Apple extends Fruit {
    // 추가적으로 작성해야 할 필드가 존재한다면 작성.
    private String 품종;

    // 생성자
    public Apple() {
    }
    public Apple(String fruitName) {
        super(fruitName);
    }

    public Apple(String fruitName, String 품종) {
        super(fruitName);
        this.품종 = 품종;
    }

    // getter, setter
    public String get품종() {
        return 품종;
    }
    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    @Override
    public void taste() {
        System.out.println(getFruitName() + "의 맛은 " + get품종() + "품종에 따라 다릅니다.");
        // ㅇㅇ 품종의 사과맛은 알 수 없습니다.
        // -> 사과의 맛은 ㅇㅇ품종에 따라 다릅니다.
    }

    // info 메서드는 abstract가 붙지 않아 자식클래스에서 필수로 재설정하지 않아도 됨.
}
