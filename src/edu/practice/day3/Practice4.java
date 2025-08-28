package edu.practice.day3;

/**
 * 문제 4 : 학생 성적 관리 시스템
 */
public class Practice4 {
    private String name;
    private int studentId;
    private int[] scores = new int[5];
    private String[] subjects = {"국어", "영어", "수학", "과학", "사회"};

    // 생성자
    public Practice4() {
    }

    public Practice4(String name, int studentId, int[] scores) {
        this.name = name;
        this.studentId = studentId;
        this.scores = scores;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getScores() {
        return scores;
    }

    public String[] getSubjects() {
        return subjects;
    }

    /* 메서드 */
    public void inputScores(){

    }
}
