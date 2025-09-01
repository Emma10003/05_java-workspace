package edu.practice.day6;

/**
 * 부모클래스
 * 모든 네이버 서비스의 공통 기능을 제공하는 부모클래스
 */
public class NaverService {
    protected String serviceName;   // 쇼핑, 블로그, 카페 등 서비스 명칭
    protected String userId;        // 유저 아이디
    protected String userNickname;  // 유저 닉네임
    protected int userLevel;        // 유저 등급

    public NaverService(String serviceName, String userId, String userNickname, int userLevel) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.userLevel = userLevel;
    }

    public void login() {
        System.out.println(userNickname + "님이 " + serviceName + "에 로그인했습니다.");
    }

    public void logout() {
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    public void search() {
        System.out.println("검색합니다.");
    }

    public void writeContent() {
        System.out.println("작성합니다.");
    }

    public String getServiceName() { return serviceName; }
    public String getUserId() { return userId; }
    public String getUserNickname() { return userNickname; }
    public int getUserLevel() { return userLevel; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setUserNickname(String userNickname) { this.userNickname = userNickname; }
    public void setUserLevel(int userLevel) { this.userLevel = userLevel; }
}
