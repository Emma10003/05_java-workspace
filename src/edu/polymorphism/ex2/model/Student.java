package edu.polymorphism.ex2.model;

public class Student extends UniverseMember {
    // 필드
    private String studentName;
    private String studentId;
    private String studentMajor;
    private int studentGrade; // 학년
    private double studentGpa; // 학점

    /* 메서드 */
    // 기본생성자
    public Student() {
    }
    // 매개변수 생성자 - 자식클래스 필드만
    public Student(String studentName, String studentId, String studentMajor, int studentGrade, double studentGpa) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }
    // 매개변수 생성자 - 부모클래스 필드만
    public Student(String name, String id) {
        super(name, id);
    }
    // 매개변수 생성자 - 부모 + 자식클래스 필드 모두
    public Student(String name, String id, String studentName, String studentId, String studentMajor, int studentGrade, double studentGpa) {
        super(name, id);
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    // getter, setter
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public String getStudentMajor() { return studentMajor; }
    public void setStudentMajor(String studentMajor) { this.studentMajor = studentMajor; }
    public int getStudentGrade() { return studentGrade; }
    public void setStudentGrade(int studentGrade) { this.studentGrade = studentGrade; }
    public double getStudentGpa() { return studentGpa; }
    public void setStudentGpa(double studentGpa) { this.studentGpa = studentGpa; }

    @Override
    public String toString() {
        return super.toString() + "\nstudentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentGpa=" + studentGpa +
                '}';
    }
}
