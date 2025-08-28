package edu.practice.day4;

/**
 * 학생 정보 관리 클래스
 */
public class Student {
    /* 필드 */
    private String name;
    private String studentId;
    private int score;

    /* 생성자 */
    public Student() {
    }

    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    /* 메서드 - getter, setter */
    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }

    /* 메서드 - 기타 기능 */

    /**
     * 학생 정보 출력 메서드
     */
    public void displayInfo(){
        System.out.println("===== 학생 정보 관리 시스템 =====");
        System.out.println("학생명: " + getName());
        System.out.println("학번: " + getStudentId());
        System.out.println("점수: " + getScore() + "점");
        System.out.println("결과: " + isPass(getScore()));
            // 같은 클래스 내에서 메서드를 호출할 때
            // 클래스명칭이나 객체 변수명칭을 생략하고 호출할 수 있다.
            // -> return 값이 존재할 때!
    }

    /**
     * 합격 여부 반환 메서드
     */
    public String isPass(int score) {
        String result = (score >= 60 ? "합격" : "불합격"); // 각각의 결과를 return 으로 반환
        return result;
    }
}
