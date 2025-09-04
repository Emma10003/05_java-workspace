package edu.practice.day8.model.videoPlayer;

public class TikTok implements VideoPlayer{
    private String creator;

    public TikTok(String videoTitle) {
        this.creator = videoTitle;
    }

    // getter, setter
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    // 오버라이드로 작성하는 기능들 모두 get 형태로 변경
    @Override
    public void upload() {
        System.out.printf( "🎵 %s님이 틱톡에 숏폼 영상을 올립니다!", getCreator());
    }

    @Override
    public void play() {
        System.out.printf("▶️ %s님의 틱톡 영상 재생 중! 중독성 있어요~", getCreator());
    }

    @Override
    public void pause() {
        System.out.printf("⏸️ 틱톡 영상을 잠시 멈춥니다.");
    }
}
