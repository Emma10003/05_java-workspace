package edu.practice.day6;

public class NaverBlog {
    private String serviceName;
    private String userId;
    private String userNickname;
    private int userLevel;

    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel) {
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
        System.out.println("블로그에서 포스트를 검색합니다.");
    }

    public void writeContent() {
        System.out.println("블로그 포스트를 작성합니다.");
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
