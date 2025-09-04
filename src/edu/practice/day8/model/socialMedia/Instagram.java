package edu.practice.day8.model.socialMedia;

public class Instagram implements SocialMedia {
    // 필드
    private String photo;

    // 생성자
    public Instagram() {
    }
    public Instagram(String photo) {
        this.photo = photo;
    }

    // getter, setter
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    // 메서드 재정의
    @Override
    public void post() {
        System.out.printf("📸 인스타그램에 %s 사진을 올립니다! #일상 #맛집", getPhoto());
    }

    @Override
    public void like() {
        System.out.println("❤️ 인스타그램 게시물에 좋아요를 눌렀습니다!");
    }

    @Override
    public void share() {
        System.out.println( "📤 인스타그램 스토리에 공유했습니다!");
    }
}
