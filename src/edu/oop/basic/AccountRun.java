package edu.oop.basic;

/**
 * 계좌 기능 실행 클래스
 */
public class AccountRun {
    // JVM 바라보는 메인메서드.      args의 매개변수 이름은 변경해도 되지만 나머지는 그대로 유지
    // 되도록이면 수정없이 사용!
    public static void main(String[] args){
        //  Account 객체 생성
        Account a1 = new Account(); // Account() : 기본생성자를 호출해서 객체 생성

        // private 이 설정된 값과 설정되지 않은 값 접근가능 여부 확인
        // private 을 적용한 변수(필드)는 외부에서 보이지 않음(정보 은닉)

        // a1.accountNumber = "1234"; 또는 Account.accountNumber = "1234;
        // Account 클래스 내부에 작성된 속성변수 이름 accountNumber 는 private 형태
        //      => 다른 클래그에서 직접적으로 접근 불가!
        
        // 간접 접근 기능을 이용해서 값을 세팅
        a1.setName("홍길동"); // name이라는 변수이름을 간접적으로 사용하는 setName에서
                              // "홍길동" 명칭을 가지고 있는 상태
        
        // 간접 접근 기능을 이용해서 객체 내부에 저장되어 있는 데이터 출력
        a1.getName(); // .setName()으로 저장한 데이터를 가져오기
        // .getName()은 가져오는 것이지, 가져온 데이터를 출력하는 메서드가 아님!!!
        // .getName()으로 가져온 데이터를 확인하기 위해서는 System과 같은 출력문 내부에 작성해야 함.
        System.out.println(a1.getName());
        a1.setAccountNumber("123-456-789");
        a1.setPassword("7890");

        /*
        Account class 에서 accountNumber를 String 자료형으로 작성한다 표기했기 때문에
            private String accountNumber;

        데이터를 저장하는 것 또한 String 형태여야 함.
        a1.setAccountNumber("123-456-789");

        저장된 데이터를 가져와서 변수이름에 넣어서 사용할 경우 또한
        String 형태여야 함.
            int a1Num = a1.getAccountNumber();

        => 설정한 클래스 속성값의 자료형과 getter로 가져온 값을 저장할 변수의 자료형을 맞춰줘야 함!!
         */
        String a1Num = a1.getAccountNumber();
        String a1Password = a1.getPassword();
        System.out.println(a1Num);
        System.out.println(a1Password);
    }
}
