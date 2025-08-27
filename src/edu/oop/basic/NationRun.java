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

        n1.setName = "홍길동";
        n1.setAge = 25;
        n1.setGender = '남';
        System.out.printf("이름은 %s이고, %d세 %c성 입니다.\n", n1.getName, n1.getAge, n1.getGender);
    }
}
