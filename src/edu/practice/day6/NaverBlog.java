package edu.practice.day6;

public class NaverBlog extends NaverService {
    // 필드
    private int postCount;      // 포스트 수
    private int visitorCount;   // 방문자 수

    // 기본생성자
    public NaverBlog() {
    }
    // 필수생성자 - 4개
    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }
    // 필수생성자 - 6개
    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel, int postCount, int visitorCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.postCount = postCount;
        this.visitorCount = visitorCount;
    }

    // 오버라이드
    @Override
    public void search() {
        System.out.println("블로그에서 포스트를 검색합니다.");
    }
    @Override
    public void writeContent() {
        System.out.println("블로그 포스트를 작성합니다.");
    }

    // 고유 메서드
    public void addNeighbor(){
        System.out.println(serviceName + "님이 이웃을 추가했습니다.");
        visitorCount++;
    }
    public void customizeTheme(){
        System.out.println(serviceName + "님이 테마를 꾸몄습니다.");
        postCount++;
    }

    // getter, setter
    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }
}
