package edu.inheritance.ex3;

/**
 * 구글 서비스 부모 클래스
 */
public class GoogleService {
    // private 은 해당 클래스 내에서만 접근 가능, 자식 클래스에서 접근 불가능!
    // protected 는 해당 클래스 + 자식 클래스에서 직접 접근 가능.
    protected String serviceName;   // 서비스명 (Gmail, Youtube, GoogleDrive 등)
    protected String userEmail;     // 사용자 이메일 주소
    protected String userName;      // 사용자 성명(실명)
    protected String accountType;   // 계정 타입(개인용, 기업용, 학생용 등)

    // 상속은 "확장"의 개념이므로, 자식클래스가 부모의 속성을 자유롭게 사용할 수 있도록
    // protected 를 사용함.

    // 기본생성자
    public GoogleService() {}
    // 필수생성자
    public GoogleService(String serviceName, String userEmail, String userName, String accountType) {
        this.serviceName = serviceName;
        this.userEmail = userEmail;
        this.userName = userName;
        this.accountType = accountType;
    }

    // 공통으로 사용할 메서드 (변경 X)
    public void login(){
        System.out.println(userName + "님이 " + serviceName + "에 로그인했습니다.");
    }
    public void logout(){
        System.out.println(userName + "님이 " + serviceName + "에 로그아웃했습니다.");
    }
    public void syncData(){
        System.out.println(serviceName + "에서 데이터 동기화를 진행합니다.");
    }
    public void showUserInfo(){
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + serviceName);
        System.out.println("이메일: " + userEmail);
        System.out.println("이름: " + userName);
        System.out.println("계정타입: " + accountType);
        System.out.println("===================");
    }

    // 자식 클래스에서 오버라이딩 할 메서드
    public void search(){
        System.out.println(serviceName + "에서 검색합니다.");
    }
    public void share(){
        System.out.println(serviceName + "에서 공유합니다.");
    }

    // getter, setter
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
