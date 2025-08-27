package edu.oop.basic.ex;

public class Employee {
    /* 속성(필드) - private 으로 캡슐화 */
    private String name;                // 이름
    private int age;                    // 나이
    private String department;          // 부서
    private String position;            // 직급
    private int salary;                 // 연봉 (만원 단위)
    private String employeeId;          // 사원번호
    private int workYears;              // 근무년수

    /* 기능(메서드) */
    // 생성자 - 기본생성자
    public Employee() {
    }

    // 생성자 - 필수생성자 : 이름, 부서, 직급, 사원번호만
    public Employee(String name, String department, String position, String employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getWorkYears() {
        return workYears;
    }

    // 개발자가 필요로 하는 기능 생성
    /**
     * 회사원 자기소개
     */
    public void introduce(){
        System.out.printf("안녕하세요. %s 부서 %s %s입니다.\n", department, position, name);
//        System.out.printf("안녕하세요. %s 부서 %s %s입니다.\n", getDepartment(), getPosition(), getName());
//        -> 이렇게 getter을 사용해도 똑같이 기능함.
    }

    /**
     * 근무상태 출력
     */
    public void work(){
        System.out.printf("%s님이 %s 부서에서 열심히 근무 중입니다.\n", getName(), getDepartment());
    }

    /**
     * 연봉 정보 출력
     */
    public void salaryInfo(){
        System.out.printf("%s님의 연봉 : %,d만원\n", getName(), getSalary());
    }

    /**
     * 승진 가능 여부 확인
     * 근무연수 3년 이상이면 승진 가능
     * checkPromotion
     * if문 사용
     * 3년 이상은 ㅇㅇ님은 근무년수 ㅇㅇ년으로 승진 대상자입니다.
     * 3년 이하는 ㅇㅇ님은 근무년수 ㅇㅇ년으로 승진까지 ㅇㅇ년 더 필요로 합니다.
     */
    public void checkPromotion(){
        if(workYears >= 3) {
            System.out.printf("%s님은 근무년수 %d년으로 승진 대상자입니다.\n", getName(), getWorkYears());
        } else {
            System.out.printf("%s님은 근무년수 %d년으로 승진까지 %d년 더 필요로 합니다.\n", getName(), getWorkYears(), 3-getWorkYears());
        }
    }
    /*
        * ---- 캡슐화 원칙대로 수행
        System.out.printf("%s님은 근무년수 %d년으로 승진 대상자입니다.\n", getName(), getWorkYears());
        * ---- 캡슐화 원칙 위배하여 수행
        System.out.printf("%s님은 근무년수 %d년으로 승진 대상자입니다.\n", name, workYears);
        
        추후에는
        속성만 작성해놓은 클래스,
        속성을 활용한 기능(메서드)를 작성해놓은 클래스,
        속성과 기능을 활용해서 실행하는 클래스
        로 나뉨.
        
        위에 작성한 System 구문이 모두 가능하지만, 추후 미래를 위해 get변수이름() 형식으로 작성하는 습관을
        갖고있는 것이 좋음.
        
     */
}
