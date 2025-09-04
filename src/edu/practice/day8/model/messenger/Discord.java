package edu.practice.day8.model.messenger;

public class Discord implements Messenger{
    // 필드
    private String server;

    // 생성자
    public Discord() {
    }
    public Discord(String server) {
        this.server = server;
    }

    // getter, setter
    public String getServer() {
        return server;
    }
    public void setServer(String server) {
        this.server = server;
    }

    // 메서드 재정의
    @Override
    public void sendMessage() {
        System.out.printf("💬 %s 서버에 메시지를 보냅니다!", getServer());
    }

    @Override
    public void receiveMessage() {
        System.out.printf( "📱 %s 서버에서 새 메시지가 도착했어요!", getServer());
    }

    @Override
    public void makeCall() {
        System.out.printf("🎤 %s 서버 음성채널에 접속!", getServer());
    }
}
