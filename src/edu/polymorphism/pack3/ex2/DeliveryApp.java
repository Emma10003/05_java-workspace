package edu.polymorphism.pack3.ex2;

/**
 * 추상 없는 부모클래스 : 공통된 필드 + 공통된 메서드
 */
public class DeliveryApp {
    protected String appName;   // 어플 이름
    protected String userName;  // 사용자 이름

    // 생성자
    public DeliveryApp() {
    }
    public DeliveryApp(String appName, String userName) {
        this.appName = appName;
        this.userName = userName;
    }

    // getter, setter
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // 공통 메서드
    public void showAccount(){
        System.out.println("[" + getAppName() + "] " + getUserName() + " 님의 계정입니다.");
    }
    public void payMoney(int amount){ // amount는 DB에서 가져오거나 저장할 데이터가 아니기 때문에 getter 없음.
        System.out.printf("[%s] %d원을 결제했습니다.", getAppName(), amount);
    }
}
