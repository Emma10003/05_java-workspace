package edu.oop.method;

/**
 * 메서드
 * : 특정 작업을 수행하는 코드의 집합
 *   데이터를 넣고 처리된 결과를 실행하고, 반환하기도 함
 *
 *   기본 구조
 *      접근제한자 [static] 반환타입 메서드명칭(매개변수 = 파라미터) {
 *          // 실행할 코드
 *          return 반환타입에 해당하는 반환값 데이터;
 *      }
 *      
 *      접근제한자 [static] void 반환타입 메서드명칭(매개변수 = 파라미터) {
 *          // 실행할 코드
 *      }
 *      
 *   메서드 기능에 클래스 메서드와 인스턴스 메서드가 존재.   
 *   - 클래스 메서드 (static Method) / 클래스 변수 (static Variable)
 *      : static 키워드가 붙은 메서드 / 변수
 *        객체 생성 없이 클래스명칭으로 직접 호출
 *        모든 객체가 공유하는 기능
 *   - 인스턴스 메서드(Instance Method) / 인스턴스 변수 (Instance Variable)
 *      : 간단히 기능/변수을 사용할 수 있고, 사용 후 메모리에서 정리되는 메서드 / 변수
 *        static이 없는 일반 기본 메서드 / 변수
 *        객체를 생성한 후 객체에 붙은 변수이름을 통해 호출
 *        각 객체별로 개별적인 기능 수행
 */
public class MethodEx {
    // 1. void 메서드(반환값 없음)
    public void welcomeMessage(){
        System.out.println("환영합니다."); // 특정 기능을 출력하고 끝
    }

    // 2. 매개변수 메서드(입력값 처리)
    public void orderCoffee(String coffeeName, int quantity){
        // 커피 이름과 수량을 매개변수로 전달받아서 처리
    }

    // 3. 반환값 메서드(결과 돌려줌)
    public int getOrder(int productPrice, int quantity){
        // 총 가격     =   개수    *   제품가격
        int totalPrice = quantity * productPrice;
        return totalPrice;
    }

    // 4. boolean 메서드(참/거짓 판단)
    public boolean isPopularCafe(){
        int totalOrders = 100;
        boolean result = totalOrders >= 50;
        return result;
//        return totalOrders >= 50;
    }
    
    // 5. static 메서드 (= 클래스 메서드)
    //     호출방법:    클래스파일명칭.static기능명칭(매개변수 존재 유무);
    public static void systemInfo(){
        // "모든 객체들이 알아야 하는" 컴퓨터의 기본 정보 작성

    }
    // 나중에 systemInfo 기능을 사용할 때는
    //  MethodEx ex = new MethodEx();
    //  ex.systemInfo(); 형식으로 작성하는 게 아니라,
    //  MethodEx.systemInfo(); 형식으로 작성해야 한다.

    /* 6. 메서드 오버로딩(Method Overloading)
        : 하나의 클래스 내부에서 이름이 동일한 메서드를 여러 개 정의하는 것.
          같은 이름으로 새로운 메서드를 계속 추가하는 것

          오버로딩 조건
          : 메서드 이름은 같아야 하지만, 매개변수는 달라야 함.
            1. 매개변수의 자료형 개수가 다른 경우
            2. 매개변수의 개수가 다른 경우
            3. 매개변수의 개수는 같지만 자료형이 다른 경우
            4. 매개변수의 개수와 자료형은 같지만 순서가 다른 경우

        생성자는 오버로딩에 해당.
        생성자 ┌- 기본 생성자 : 매개변수 존재하지 않는 생성자
              │               작성하지 않아도 기본적으로 존재하나, 매개변수 생성자가 생성되면
              │               기본 생성이 소멸되기 때문에, 작성해주어야 함!
              │
              └- 필수 생성자 : 파라미터  = 매개변수를 필수로 작성한 후 객체를 생성해야 하는 생성자
                              대표적인 오버로딩.
     */

    // 로그인 진행

    // 6-1. 아이디(String)와 비밀번호(String)로 로그인
    public void login(String username, String password){
        System.out.println(username + " 님 환영합니다.");
    }
    // 6-2. 소셜 로그인 토큰(String)으로 로그인
    //      SNS 로그인 -> SNS 회사에서는 진짜 아이디와 비밀번호를 외부 개발자에게 제공하지 않음.
    //      대신 SNS를 통해 본인인증을 마쳤으니 믿고 입장해도 좋다는 의미로 토큰을 제공함.
    //      축제나 클럽에 들어갈 때 입구에서 신분증을 보여주고 본인인증을 하면
    //      다시는 신분증을 꺼낼 필요 없이 팔찌만 보여주고 자유롭게 다닐 수 있는 것 처럼
    //      온라인에서는 팔찌 대신 토큰을 제공함.
    public void login(String socialToken){
        System.out.println("[소셜 로그인] 토큰으로 간편 로그인 성공!");
    }
    // 6-3. 유저아이디(int)와 비밀번호(String)으로 로그인
    public void login(int userId, String password) {
        System.out.println("userId와 password가 일치합니다.");
    }
    // 6-4. 매개변수가 존재하지 않는 로그인 기능
    public void login(){

    }
    // 6-5. 매개변수에서 자료형이 동일하고 개수도 동일할 경우
//    public void login(String email) {
//      'login(String)'이(가) 'edu.oop.method.MethodEx'에 이미 정의되어 있습니다
//      -> 에러 발생
//    }
}
