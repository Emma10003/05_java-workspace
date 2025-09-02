package edu.inheritance.ex3;

public class GoogleServiceRun {
    public static void main(String[] args) {
        
        // 1. Gmail 객체 생성
        Gmail gmail = new Gmail("user@gmail.com", "홍길동",
                "개인계정", 150, 8);
        
        // 2. Youtube 객체 생성
        Youtube youTube = new Youtube("user1@gmail.com", "박길동",
                "개인계정", 50, true);

        // 3. 다형성을 활용한 배열 생성
        // 부모클래스로 자식들을 [] 배열처리해서 리스트로 나열 가능 = 나열될 자식 클래스들
        // for(부모클래스 하나씩출력할변수이름 : 부모클래스 배열 변수명) {
        //              하나씩출력할변수이름.부모클래스메서드();
        // }
        // 와 같이 향상된 for문 사용.
        GoogleService[] 서비스들 = {gmail, youTube};

        System.out.println("=== 구글 서비스 사용자 정보 ===");
        // gmail.showUserInfo();
        // youTube.showUserInfo();
        for(GoogleService 하나씩공통된기능확인하기 : 서비스들) {
            System.out.println("=== 구글 서비스 사용자 정보 ===");
            하나씩공통된기능확인하기.showUserInfo();

            System.out.println("\n=== 로그인 ===");
            하나씩공통된기능확인하기.login();

            System.out.println("\n=== 서비스별 검색 ===");
            하나씩공통된기능확인하기.search();
        }

        // System.out.println("\n=== 로그인 ===");
        // gmail.login();
        // youTube.login();
        //
        // System.out.println("\n=== 서비스별 검색 ===");
        // gmail.search();
        // youTube.search();

        System.out.println("\n=== 서비스별 고유 기능 ===");
        gmail.sendEmail();
        youTube.uploadVideo();
        youTube.subscribe();
        youTube.watchAd();

        System.out.println("구독자 수: " + youTube.get구독자수() + "명");

        System.out.println("\n=== 로그아웃 ===");
        gmail.logout();
        youTube.logout();
    }
}
