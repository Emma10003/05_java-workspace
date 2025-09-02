package edu.polymorphism.ex2.model;

public class Professor extends UniverseMember {
    // 필드
    private String professorName;
    private String professorId;
    private String professorDepartment;
    private String professorOfficeLocation;
    private double professorSalary;

    /*
    코드 분류 후 생성자 만들기
    - 기본생성자
    - 자식 클래스 필드만 기본으로 만들어지는 생성자
    - 부모 클래스 필드만 기본으로 만들어지는 생성자
    - 부모 클래스 + 자식 클래스 필드 모두 기본으로 만들어지는 생성자
     */

    /* 메서드 */
    // 기본생성자
    public Professor() {
    }
    public Professor(String name, String id, String professorDepartment) {
        // 교수님의 이름과 아이디는 UniverseMember 필드에 작성된 변수명 사용
        super(name, id);
        // 교수님의 부서는 Professor 클래스에 작성된 변수명 사용
        this.professorDepartment = professorDepartment;
    }
    // 매개변수 생성자 - 자식클래스 필드만 기본으로 만들어짐
    public Professor(String professorName, String professorId, String professorDepartment, String professorOfficeLocation, double professorSalary) {
        this.professorName = professorName;
        this.professorId = professorId;
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }
    // 매개변수 생성자 - 부모클래스 필드만 기본으로 만들어짐
    public Professor(String name, String id) {
        super(name, id);
    }
    // 매개변수 생성자 - 부모 + 자식클래스 필드 모두 기본으로 만들어짐
    public Professor(String name, String id, String professorName, String professorId, String professorDepartment, String professorOfficeLocation, double professorSalary) {
        super(name, id);
        this.professorName = professorName;
        this.professorId = professorId;
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }

    // getter, setter
    public String getProfessorName() { return professorName; }
    public void setProfessorName(String professorName) { this.professorName = professorName; }
    public String getProfessorId() { return professorId; }
    public void setProfessorId(String professorId) { this.professorId = professorId; }
    public String getProfessorDepartment() { return professorDepartment; }
    public void setProfessorDepartment(String professorDepartment) { this.professorDepartment = professorDepartment; }
    public String getProfessorOfficeLocation() { return professorOfficeLocation; }
    public void setProfessorOfficeLocation(String professorOfficeLocation) { this.professorOfficeLocation = professorOfficeLocation; }
    public double getProfessorSalary() { return professorSalary; }
    public void setProfessorSalary(double professorSalary) { this.professorSalary = professorSalary; }

    @Override
    public String toString() {
        return super.toString() + "\nprofessorDepartment='" + professorDepartment + '\'' +
                ", professorOfficeLocation='" + professorOfficeLocation + '\'' +
                ", professorSalary=" + professorSalary +
                '}';
    }
}
