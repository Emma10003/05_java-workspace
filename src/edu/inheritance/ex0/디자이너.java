package edu.inheritance.ex0;

public class 디자이너 extends 직원{
    /* 'extends 직원' 을 활용해서
     * 하나하나 직접 작성해야 하는 필드명 중 공통적으로 활용할 필드명을 직원 클래스에 작성하고,
     * 이외에 추가로 필요한 필드명만 자식클래스(디자이너)에서 작성.
     *     private String eName;       // 사원명
     *     private int eId;            // 사원번호
     *     private double baseSalary;  // 기본급
     *     private String department;  // 부서
     */
    private String designTool; // 디자인하는 도구

    public 디자이너(String eName, int eId, double baseSalary, String department, String designTool) {

        /*
         * 하나하나 직접 작성해야 하는 this를 직원 클래스에 작성하고,
         * super를 이용하여 직원 클래스에 작성된 this를 참조해서 사용한다고 표기.
         *    this.eName = eName;
         *    this.eId = eId;
         *    this.baseSalary = baseSalary;
         *    this.department = department;
         */
        super(eName, eId, baseSalary, department);
        this.designTool = designTool;
    }

    // getter, setter
     public String getDesignTool() {
        return designTool;
     }
     public void setDesignTool(String designTool) {
        this.designTool = designTool;
     }

    /* 메서드 */

    /**
     * @Override 표기는 extends 상속클래스로 가져온 부모 클래스의 기능을 재활용한다는 표기.
     * 작성하지 않아도 동작하는 데에는 문제 없지만,
     * 작성해주는 것이 개발자 간의 예의.
     */
    @Override
    public void info(){
        super.info();
        System.out.println("주 사용 디자인 도구: " + getDesignTool());
    }

    @Override
    public void work(){
        // super.work() 는 부모에 작성된 기능들을 추가로 사용하고자 할 때 작성
        // 기능에서는 super.기능명칭() 을 작성하는 것이 필수가 아님!!
        System.out.println(geteName() + " 디자이너가 " + getDesignTool() + "를 활용해 디자인합니다.");
    }
}
