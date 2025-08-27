package edu.oop.basic;
// 클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 글(코드) 형태로 작성해둔 문서
// 문서를 추후에 'new 클래스명()' 생성자를 이용하여 객체로 호출
/**
 * 국민 객체를 만들기 위한 클래스
 */
public class Nation {
    // private 대신 public을 이용하여 다른 클래스 파일에서 Nation에 작성된 속성 기능 호출해서 사용

    /* 속성(값) */
    private String name;            // 이름
    private int age;                // 나이
    private char gender;            // 성별
    private String juminNumber;     // 주민등록번호
    private String tel;             // 전화번호
    private String address;         // 주소

    /* 메서드 기본생성자, 필수생성자 생성
    *       필수생성자의 경우, 필드 속성값에 작성되어 있는 변수명칭 순서대로 작성
    * */
    // 기본생성자
    public Nation() {
    }

    // 필수생성자
    public Nation(String name, int age, char gender, String juminNumber, String tel, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.juminNumber = juminNumber;
        this.tel = tel;
        this.address = address;
    }

    // setter(데이터를 간접적으로 저장하는 역할)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set변수이름 을 직접적으로 활용하지 않으면
     *  setJuminNumber 메서드 이름처럼 회색빛으로
     *  사용되지 않은 메서드임이 표기되어 있음.
     */
    // *************************************************
    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJuminNumber(String juminNumber) {
        this.juminNumber = juminNumber;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /* ************************
        Getter 를 활용하는 경우
        1. 다른 클래스에서 정보가 필요할 때
        2. 매개변수로 값을 전달할 때
        3. 조건문에서 값을 비교할 때
        4. 계산 작업할 때
        -----------------
        현재는 getter 를 활용해서 setter에 저장된 데이터를 출력하지만
        추후에는 DB에 저장된 값을 전달하는 용도로 주로 사용
        회원가입 시 이메일 인증번호 일치 여부와 같이 특정 데이터에 대한 값 확인할 때도 많이 사용
        주로 프론트엔드로 DB에 존재하는 데이터를 전달할 때 많이 사용

        수정하기 -> DB에서 수정해야 하는 게시물 번호를 get으로 가져오기
                   -> 게시물 번호에 해당하는 데이터를 get으로 전달하여 프론트엔드에서 JS로 전달받아
                   -> html 문서에서 클라이언트가 데이터를 확인할 수 있도록 설정하는 용도.
     ************************ */

    // getter(데이터를 간접적으로 사용하는 역할)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getJuminNumber() {
        return juminNumber;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }




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
     *
     * name, age, gender 는 외부에서 변수이름을 직접적으로 호출해서 사용불가.
     *  (private 작성한 클래스 내부에서만 변수이름을 사용 가능하게끔 설정했기 때문)
     *  public void introduce() 메서드 내부에서 변수이름을 호출하고
     *      외부에서 name을 불러오는 대신에 introduce() 기능을 이용해서 변수이름에 해당하는 값을 확인 가능.
     */
    public void introduce(){
        System.out.printf("이름은 %s이고, %d세 %c성 입니다.\n", name, age, gender);
    }

}
