package edu.oop.basic.ex;

/**
 * Employee 클래스를 활용한 캡슐화 및 생성자 기능 실행 클래스
 */
public class EmployeeRun {
    public  static void main(String[] args) {
        Employee emp1 = new Employee();
        // 기본 생성자를 활용해서 데이터 추가
        emp1.setName("김개발");
        emp1.setAge(28);
        emp1.setDepartment("개발팀");
        emp1.setPosition("주임");
        emp1.setSalary(4500);
        emp1.setEmployeeId("DEV100");
        emp1.setWorkYears(2);

        // 필수 생성자를 이용해서 핵심 정보를 우선적으로 데이터 작성
        // 이외 데이터는 set을 활용해서 추가
        // 박기획 기획팀 대리 PLN007
        /*
        Employee 에 존재하지 않는 매개변수생성자를 호출하면
            Employee emp2 = new Employee("박기획", "기획팀");

            ↓ 아래와 같이 생성자를 해결할 수 없습니다 와 함께
            생성자 'Employee(String, String)'을(를) 해결할 수 없습니다

            ↓ Employee d ↓ 와 같은 코드를 생성
            public Employee(String 박기획, String 기획팀) {
            }
            
            코드를 생성하기 보다는 활용하고자 하는 클래스를 방문하여
            생성자에 존재하는 필수 생성자에서 매개변수가 어떻게 어떤 순서대로 작성되어 있는지 확인할 것!
         */
        Employee emp2 = new Employee("박기획", "기획팀",
                "대리",  "PLN007");
        // ↑ 기본생성자 - 회원가입을 할 때 필수로 작성해야 하는 매개변수들 
        //             (필수로 데이터 저장해야 하는 값들을 담은 변수명칭)
        emp2.setAge(32);
        emp2.setSalary(5200);
        emp2.setWorkYears(5);
        
        // 기본 생성자로 회사원 객체 emp3를 생성하고 다음 정보만 설정하세요.
        // 이름: "최신입", 나이: 24, 부서: "인사팀", 직급: "사원"
        // 연봉: 3800, 사원번호: "HR003", 근무년수: 1
        // 필수생성자 + set 메서드 활용
        Employee emp3 = new Employee("최신입", "인사팀", "사원", "HR003");
        emp3.setAge(24);
        emp3.setSalary(3800);
        emp3.setWorkYears(1);

        // 상세 정보 출력
        // 모든 직원의 상세정보를 출력
        System.out.println("===== 전 직원 상세 정보 =====");
//        System.out.println(toString(emp1)); -> 틀린 코드!
        // Employee 직원들 중에서 직원 1번에 대한 정보를 출력
        // emp1 변수이름에는 Employee 클래스에서 작성한 메서드 기능들을 사용할 수 있음
        // @Override            : 기존에 존재하는 기능을 재수정해서 사용한다는 뜻.
        //                        표기가 없어도 정상 작동 / 재사용한다는 표기
        // pulic class Employee{
        //      public String toString()
        // }
        //  => Employee.toString() 이 맞지만, 변수이름에 해당하는 직원 정보를 출력하는 것이기 때문에
        //         emp1.toString() 형식으로 작성
        System.out.println(emp1.toString()); // 메서드 형식으로 씀 (emp1.메서드명()) + toString()은 매개변수 X!
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
