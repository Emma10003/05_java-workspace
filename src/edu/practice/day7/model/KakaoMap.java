package edu.practice.day7.model;

public class KakaoMap extends KakaoService{
    // 필드
    private String currentLocation;
    private boolean isGPSEnabled;

    // 생성자
    public KakaoMap() {
        super();
        this.currentLocation = "위치 정보 없음";
        this.isGPSEnabled = false;
    }
    public KakaoMap(String serviceName, String userId, String userNickname) {
        super(serviceName, userId, userNickname);
    }
    public KakaoMap(String serviceName, String userId, String userNickname, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname);
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
    }

    // getter, setter
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    public boolean isGPSEnabled() {
        return isGPSEnabled;
    }
    public void setGPSEnabled(boolean GPSEnabled) {
        isGPSEnabled = GPSEnabled;
    }

    // 메서드 재정의
    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("현재 위치: " + getCurrentLocation());
        System.out.println("GPS 상태: " + (isGPSEnabled() ? "활성화" : "비활성화"));
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오맵 알림] " + message);
    }

    @Override
    public void receiveNotifications(String message) {
        System.out.println("[카카오맵에서 알림 수신] " + message);
    }


    // 추상메서드
    @Override
    public void startService() {
        System.out.println("카카오맵을 시작합니다. 길찾기 서비스가 준비되었습니다!");
        if (isGPSEnabled()) {
            System.out.println("GPS가 활성화되었습니다.");
        }
    }
    @Override
    public void stopService() {
        System.out.println("카카오맵을 종료합니다. 경로 기록을 저장했습니다.");
    }
    @Override
    public String getServiceType() {
        return "MAP";
    }
    @Override
    public void performSpecialAction() {
        System.out.println("길찾기 기능을 실행합니다.");
        System.out.println("최적의 경로를 안내해드리겠습니다.");
    }
    
    // 고유메서드
    public void searchLocation(String location) {
        if (!"MAP".equals(getServiceType())) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        System.out.println("'" + location + "' 검색 결과를 표시합니다.");
    }

    public void findRoute(String start, String end) {
        if (!"MAP".equals(getServiceType())) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        System.out.println(start + "에서 " + end + "까지의 경로를 찾습니다.");
        System.out.println("예상 소요시간: 25분, 거리: 8.5km");
    }

    public void enableGPS() {
        if (!"MAP".equals(getServiceType())) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        this.isGPSEnabled = true;
        System.out.println("GPS를 활성화했습니다. 현재 위치: " + getCurrentLocation());
    }

    public void updateLocation(String 새로운장소) {
        System.out.println("위치가 새롭게 변경되었습니다. " + 새로운장소);
    }
}
