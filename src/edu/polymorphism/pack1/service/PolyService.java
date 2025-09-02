package edu.polymorphism.pack1.service;

import edu.polymorphism.pack1.model.Galaxy;
import edu.polymorphism.pack1.model.Iphone;
import edu.polymorphism.pack1.model.SmartPhone;

public class PolyService {
    // 필드
    // 자료형 공간이름(변수명) = 공간을 설정할 때 공간 내에 들어올 수 있는 데이터를 Iphone 형태만 가능하도록 설정.
    // 아이폰 전용 집     집 이름 = 아이폰이 살고 있음
       Iphone            iphone1 = new Iphone();
    // 갤럭시 전용 집     집 이름 = 갤럭시가 살고 있음
       Galaxy            galaxy1 = new Galaxy();
    // 스마트폰 전용 집   집 이름 = 각 공간에 iphone, galaxy 가 살고 있음
       SmartPhone        s1      = new Iphone();
       SmartPhone        s2      = new Galaxy();
    // => 부모가 만든 공간에서           자식이 사는 것 가능
    //    자식이 만든 공간에서           본인(자식)이 사는 것 가능
    //    자식이 만든 공간에서           부모가 사는 것 불가능

    int 인트변수 = (int) 100L;  // int 의 공간보다 long이 더 데이터가 큰 숫자이므로, long을 int로 강제 형변환해서 사용 가능.
    // 가능한 이유: 둘 다 숫자임을 Java에서 알고 있기 때문.

    // SmartPhone과 Iphone, Galaxy는 Java가 아는 형태가 아니라 개발자가 만들어놓은 형태이므로 형변환이 어려움.
    //  ? 상자      ? 상자  ? 상자
    Iphone iphone3 = (Iphone) new SmartPhone(); // 마찬가지로 형변환해서 사용하면 가능하나, 데이터가 변경되며 손실이 발생할 수 있음.
    // 현재 코드에서는 문제가 일어나지 않지만, 코드를 실행하면 ClassCastException('클래스가 일치하지 않습니다') 라는 에러 발생
    //  -> 데이터 변환 시 데이터가 손실되어 문제가 발생한다는 에러.
    // SmartPhone 을 상속받는 Galaxy와 같은 데이터가 잘못 들어올 수 있기 때문에
    // 부모 변수명 = new 자식(); 은 가능하나
    // 자식 변수명 = new 부모(); 는 불가능 -> 부모가 Galaxy를 참조해서 사용할 수 있기 때문.

    // 메서드
    public void method1(){
        s1.setDisplay("레티나 디스플레이");
        s2.setDisplay("AMOLED");  // 전류를 받으면 스스로 빛을 내는 기술
        // s1.setIosVersion(20); -> SmartPhone 공간이기 때문에 Iphone 에 작성된 필드는 사용 불가.

        System.out.println("S1 display: " + s1.getDisplay());
        System.out.println("S2 display: " + s2.getDisplay());
    }

    public void method2(){
        // 동일하게 만들어진 정보에 대해서 확인할 때 주로 사용.
        // 부모 타입으로 이루어진 배열 객체를 생성하고
        // 부모 타입에 해당하는 정보를 출력할 수 있음.

        // 하나씩 작성하는 것이 아닌 배열 형태로 작성 가능
        SmartPhone 스마트폰1대 = new SmartPhone();
        SmartPhone 스마트폰2대 = new SmartPhone();
        SmartPhone 스마트폰3대 = new SmartPhone();

        SmartPhone[] 스마트폰공장 = new SmartPhone[4]; // 스마트폰 4대에 대한 정보를 sps 라는 공간에 한 번에 넣어줄 수 있다.
        스마트폰공장[0] = 스마트폰1대;  // 각각의 스마트폰 공장에 스마트폰 1대에 대한 정보를 저장
        스마트폰공장[1] = 스마트폰2대;
        스마트폰공장[2] = 스마트폰3대;
        
        스마트폰공장[0].setDisplay("아이폰 14 디스플레이");  // 와 같은 형식으로 작성
        스마트폰공장[1].setDisplay("갤럭시 S23 디스플레이");
        스마트폰공장[2].setDisplay("파이폰 디스플레이");

        // 스마트폰 공장 내에 존재하는 스마트폰들의 정보를 for문을 활용해 모두 출력
        for(SmartPhone 기기확인 :스마트폰공장) {
            System.out.println("공장 내 기기들의 디스플레이 확인: " + 기기확인.getDisplay());
        }

        // 반복적으로 출력했던 메서드(기능)들을 for문을 활용해 한 번에 출력 가능.
    }
}
