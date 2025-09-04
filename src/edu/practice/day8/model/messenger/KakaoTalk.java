package edu.practice.day8.model.messenger;

public class KakaoTalk implements Messenger{
    // 필드
    private String friend;
    
    // 생성자
    public KakaoTalk() {
    }
    public KakaoTalk(String friend) {
        this.friend = friend;
    }

    // getter, setter
    public void setFriend(String friend) {
        this.friend = friend;
    }
    public String getFriend() {
        return friend;
    }

    // 메서드 재정의
    @Override
    public void sendMessage() {
        System.out.printf("💬 %s님에게 카톡을 보냅니다! 노란색 말풍선~", getFriend());
    }

    @Override
    public void receiveMessage() {
        System.out.printf("📱 %s님으로부터 카톡이 왔어요! 톡톡~", getFriend());
    }

    @Override
    public void makeCall() {
        System.out.printf("📞 %s님과 카톡 보이스톡 연결!", getFriend());
    }
}
