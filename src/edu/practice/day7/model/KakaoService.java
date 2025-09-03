package edu.practice.day7.model;

/**
 * 부모 클래스이지만, 부모클래스를 상속받는 자식클래스들이 반드시 작성해야 하는 기능이 포함된 클래스.
 */
public abstract class KakaoService {
    // 필드
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected boolean isLoggedIn;

    // 생성자
    public KakaoService() {
    }
    public KakaoService(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.isLoggedIn = isLoggedIn;
    }

    // getter, setter
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserNickname() {
        return userNickname;
    }
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    // 일반 메서드
    public void login(){
        this.isLoggedIn = true;
        System.out.println(getUserNickname() + "님이" + getServiceName() + "에 로그인했습니다.");
    };
    public void logout(){
        this.isLoggedIn = false;
        System.out.println(getUserNickname() + "님이 " + getUserNickname() + "에서 로그아웃했습니다.");
    };
    // 자식메서드에서 재정의
    public void showUserInfo(){
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + getServiceName());
        System.out.println("아이디: " + getUserId());
        System.out.println("닉네임: " + getUserNickname());
        System.out.println("로그인 상태: " + (isLoggedIn() ? "로그인" : "로그아웃"));
        System.out.println("서비스 타입: " + getServiceType());
    };
    
    // 추상메서드
    public abstract void startService();
    public abstract void stopService();
    public abstract String getServiceType();
    public abstract void performSpecialAction();
    public abstract void sendNotification(String message);
}
