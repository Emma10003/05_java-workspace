package edu.polymorphism.pack3;

/**
 * 직원의 자식클래스로, 반드시 구현해야 하는 기능들을 추가해서 문서 작성을 완료하도록 설정할 것
 *
 * 부모클래스 상속.txt:
 * extends 부모클래스    => 부모는 오직 하나!
 *
 * 인터페이스 연결:
 * implements 구현해야하는메서드, ... 2개 이상 작성 가능.
 *
 * implements 는 반드시 extends 뒤에 와야하는 것은 아니고, 단독으로도 사용 가능!
 * -> 상속을 받지 않아도 되는 문서에 필수적으로 작성해야 하는 기능들이 존재할 경우 사용할 수 있다.
 */
public class 개발자 extends 직원 implements 업무수행기능들 {
    // 'class 개발자 implements 업무수행기능들 {}' 로 상속이 필요하지 않은 경우
    // 필수로 구현해야 하는 기능들에 대한 문서만 작성하도록 설정할 수 있음

    private String 프로그래밍언어;

    // 개발자라는 형태의 객체를 컴퓨터에 띄울 때 클라이언트 고객한테 반드시 전달받아야 하는 데이터를 매개변수명으로 설정
    public 개발자(String name, int salary, String 프로그래밍언어) {
        // super : 직원 클래스에 작성된 필드들로,
        // '직원 클래스에 작성된 this.position 에 "dev" 라는 명칭을 전달하겠다' 라고 개발자가 설정한 것.
        super(name, "dev", salary);
        this.프로그래밍언어 = 프로그래밍언어;
        // this.프로그래밍언어 : Java 코드에서 클라이언트가 작성한 데이터를 가지고 있을 변수.
        // = 프로그래밍언어    : 클라이언트가 작성한 데이터. (Java에서 활용할 수 있도록!)
    }

    @Override
    public void work() {
        System.out.println(name + " 개발자가 " + 프로그래밍언어 + "(으)로 코딩하고 있습니다.");
    }

    @Override
    public void meeting() {
        System.out.println(name + " 개발자가 개발 회의에 참석합니다.");
    }

    // 고유 메서드
    public void 코딩(){
        System.out.println(name + " 개발자가 새로운 기능을 구현합니다.");
    }
}
