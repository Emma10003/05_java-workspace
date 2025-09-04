package edu.practice.day8.model.videoPlayer;

public class Youtube implements VideoPlayer{
    private String videoTitle;

    public Youtube(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    // getter, setter
    public String getVideoTitle() {
        return videoTitle;
    }
    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    // 오버라이드로 작성하는 기능들 모두 get 형태로 변경
    @Override
    public void upload() {
        System.out.printf("📺 유튜브에 '%s' 영상을 업로드합니다!", getVideoTitle());
    }

    @Override
    public void play() {
        System.out.printf("▶️ 유튜브에서 '%s' 재생 중... 구독과 좋아요!", getVideoTitle());
    }

    @Override
    public void pause() {
        System.out.printf("⏸️ 유튜브 영상을 일시정지합니다.");
    }
}
