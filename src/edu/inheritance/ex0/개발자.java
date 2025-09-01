package edu.inheritance.ex0;
// 상속 : 부모의 코드를 물려받아 자식이 자신의 것처럼 활용

// 상속 키워드 : extends (확장하다)
//              -> 부모 코드를 자식이 물려받아
//                  자식의 전체 크기가 증가 (= 코드가 증가)
public class 개발자 extends 직원 {
    // 필드
    private String computer; // 직원 중에 개발자는 컴퓨터가 추가로 필요
    
    // 메서드
    // 기본생성자
    public 개발자(String eName, int eId, double baseSalary, String department, String computer){
        /*
         * super() : 직원에 존재하는 생성자를 가리킴
         *  - 자식 객체 생성 시 부모 생성자를 호출하는 생성자
         *
         *  1) super() : 직원 클래스 안에 존재하는 기본생성자.
         *  2) super(매개변수) : 직원 클래스 안에 존재하는 필수생성자(파라미터 생성자).
         */
        super(eName, eId, baseSalary, department);
        /*
        this 대신 super를 사용해서 매개변수로 전달받은 eName, eId, baseSalary, department 사용하겠다. 처리
            this.eName = eName;
            this.eId = eId;
            this.baseSalary = baseSalary;
            this.department = department;
        */
        this.computer = computer; // this를 여러번 작성할 필요 없이 직원 클래스에 1번만 작성하고
        // 추가로 클래스 내에서 작성된 필드만 this로 작성하면 됨
    }

    // getter, setter
    public String getComputer() {
        return computer;
    }
    public void setComputer(String computer) {
        this.computer = computer;
    }

    // 메서드
    @Override // 직원 클래스에서 작성한 기능을 참고해서 개발자 클래스가 원하는 기능으로 재활용.
    public void info() {
        /*
        public void info(){
            System.out.println("=== 직원 정보 ===");
            // eName을 직접적으로 사용해도 되지만
            // eName은 추후 DB의 컬럼명과 일치시키는 역할이 있기 때문에
            // 변수명을 직접적으로 사용하기 보다는 getter를 활용해서 작성.
            System.out.println("이름: " + geteName());
            System.out.println("사번: " + geteId());
            System.out.println("부서: " + getDepartment());
            System.out.println("기본급: " + getBaseSalary() + "원");
        }

        */
        super.info(); // 직원 클래스에서 기존 info() 기능에 작성한 코드 호출
        System.out.println("컴퓨터: " + getComputer());
    }

    @Override
    public void work(){
        /*
        public void work(){
            System.out.println(geteName() + "님이 업무를 수행합니다.");
        }
        -> 이걸 여러 번 작성하지 않고, 직원 클래스에 작성한 코드를 호출해서 활용.
        활용 후 개발자 클래스에서 원하는 출력문을 추가로 작성한 것.
         */
        System.out.println(geteName() + " 개발자가 " + getComputer() + "로 코딩을 합니다.");
    }

    // 아래는 직원 클래스에서 다른 직원까지 공통으로 사용하지 않고, 오직 개발자 클래스에서만 사용하는 기능 추가
    public void codeReview(){
        System.out.println(geteName() + " 개발자가 코드 리뷰를 진행합니다.");
    }
}
