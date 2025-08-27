package edu.oop.basic;
// 클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 글(코드) 형태로 작성해둔 문서
// 문서를 추후에 'new 클래스명()' 생성자를 이용하여 객체로 호출
/**
 * 국민 객체를 만들기 위한 클래스
 */
public class Nation {
    // private 대신 public을 이용하여 다른 클래스 파일에서 Nation에 작성된 속성 기능 호출해서 사용

    /* 속성(값) */
    public String name;            // 이름
    public int age;                // 나이
    public char gender;            // 성별
    public String juminNumber;     // 주민등록번호
    public String tel;             // 전화번호
    public String address;         // 주소

    // setter

    // getter

    /* 기능 */
    public void speakKorean(){
        System.out.println("가나다라 한국어 가능");
    }

    public void welfare(){
        System.out.println("우리나라에서 제공하는 복지를 누릴 의무가 있습니다.");
    }

    public void 납세의의무(){
        // 만 19세 이상 성인만 세금을 내는 경우
        if(age >= 19) {
            System.out.printf("%s 님은 세금 납부 대상자 입니다.\n", name);
        } else {
            System.out.printf("%s 님은 %d세 미성년자로 납부 대상자가 아닙니다. \n", name, age);
        }
    }

    /**
     * 자기소개 기능
     */
    public void introduce(){
        System.out.printf("이름은 %s이고, %d세 %c성 입니다.\n", name, age, gender);
    }

}
