package edu.oop.basic;

/**
 * Nation 클래스를 활용한 객체 생성 및 조작 실습
 */
public class NationRun {
    public static void main(String[] args){
        Nation n1 = new Nation();

        /* 속성(값)
        public String name;            // 이름
        public int age;                // 나이
        public char gender;            // 성별
        public String juminNumber;     // 주민등록번호
        public String tel;             // 전화번호
        public String address;         // 주소

        자료형 앞에 private 이 아닌 public 으로 작성했을 경우 아래와 같은 구문(n1.name = "홍길동") 수행 가능.
        은행 예시로 들었을 때 창고에 직접 들어가서 돈을 저장하는 느낌.
        */

        n1.setName("홍길동");
        n1.setAge(25);
        n1.setGender('남');
        n1.setTel("010-1234-5678");
        n1.setAddress("서울시 강남구");

        // ===== 문제 2 : 필수생성자 활용 =====
        Nation n2 = new Nation("이영희", 17, '여',
                "070312-4567890", "010-9876-5432", "부산시 해운대구");

        // ===== 문제  3 : 필수생성자 활용 =====
        Nation n3 = new Nation("박민수", 42, '남',
                "820525-1987456", "010-5555-7777", "대구시 중구");

        // ===== 자기소개 기능 활용해서 모든 국민들의 자기소개 확인
        n1.introduce();
        n2.introduce();
        n3.introduce();

        // ===== 납세의 의무 확인하여 결과 출력
        n1.납세의의무();
        n2.납세의의무();
        n3.납세의의무();

        // ===== 한국어 능력 및 복지혜택 확인
        // 1. n1 국민부터 n3 국민까지 각각 한국어 능력 및 복지혜택 확인
        n1.speakKorean();
        n1.welfare();
        n2.speakKorean();
        n2.welfare();
        n3.speakKorean();
        n3.welfare();
    }
}
