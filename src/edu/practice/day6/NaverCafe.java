package edu.practice.day6;

public class NaverCafe extends NaverService {
    // 필드
    private String cafeGrade;   // 카페 등급
    private int articleCount;   // 작성글 수

    // 기본생성자
    public NaverCafe() {
    }
    // 필수생성자 - 4개
    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }
    // 필수생성자 - 6개
    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel, String cafeGrade, int articleCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.cafeGrade = cafeGrade;
        this.articleCount = articleCount;
    }

    @Override
    public void search() {
        System.out.println("카페에서 게시글을 검색합니다.");
    }
    @Override
    public void writeContent() {
        System.out.println("카페 게시글을 작성합니다.");
    }

    // 고유 메서드
    public void joinCafe(){
        System.out.println(serviceName + "님이 카페에 가입했습니다.");
        cafeGrade = "새싹";
    }
    public void uploadFile(){
        System.out.println(serviceName + "님이 포스트를 올렸습니다.");
        articleCount++;
    }


    // getter, setter
    public String getCafeGrade() {
        return cafeGrade;
    }

    public void setCafeGrade(String cafeGrade) {
        this.cafeGrade = cafeGrade;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }
}
