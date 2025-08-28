package edu.oop.field.pack3.ex;

public class GuestHouse {
    /* 필드 */
    // static 이 붙은 필드는 프로그램 실행 시
    // static 메모리 영역에 할당된다.

    /*  static 필드 앞에 public 을 작성하는 이유
    *   -> 최초 1회만 실행되기 때문에, 누구든지 공유할 수 있도록 하는 게 목적인 예약어
    * */

    public static int totalCount = 0; // 전체 방문자 수 (모든 방문자가 공유)

    // static + final
    public static final String GUESTHOUSE_NAME = "서울 게스트하우스";
    public static final String WIFI_PASSWORD = "welcome2025";
    public static final String CHECK_IN_TIME = "15:00";
    public static final String CHECK_OUT_TIME = "11:00";
    public static final int MAX_STAY_DAYS = 30; // 최대 숙박 가능 일자
    public static final int MIN_STAY_DAYS = 1; // 최소 숙박 가능 일자
    
    private String guestName;   // 방문자 이름
    private String checkInDate; // 체크인 날짜
    private int roomNumber;     // 배정받은 방 번호

    // 초기화 블럭
    // - 객체 생성 시 필드를 {} 내부의 값으로 초기화
    {
        guestName = "익명 방문자";
        checkInDate = "2025-08-28";
        roomNumber = 101;   // 기본 방 번호
    }

    // static 초기화 블럭
    // -> 최초 1회만 읽음
    static {
        totalCount = 0; // 시스템 시작 시 방문자 수 초기화
        System.out.println("=== " + GUESTHOUSE_NAME + " 시스템 시작 ===");
    }

    // 생성자
    // 기본생성자 ::: 작성하지 않아도 자동으로 생성됨
    // 하지만 매개변수가 존재하는 필수생성자를 작성할 경우에는
    //  반드시 기본생성자 또한 작성해야 함!!
    public GuestHouse() {
    }

    /* 메서드 */
    // 메서드 setter - private 대신 데이터를 보관하는 용도
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // 메서드 getter - private 대신 데이터 값을 전달하는 용도
    public String getGuestName() {
        return guestName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    
    // 메서드 - 개발자가 필요로 하는 기능 작성
    // 추후 class 파일을 분리하여 작성할 예정

    // 메서드 체크인 - 방문자 수 증가
    public void checkIn(){
        totalCount++; // 전체 방문자 수 증가
        System.out.println(guestName + " 님이 " + roomNumber + "호실에 체크인하였습니다.");
    }

    // 메서드 방문자 정보 출력
    public void guestInfo(){
        System.out.println("========================");
        System.out.println("방문자명 : " + guestName);
        System.out.println("체크인 날짜 : " + checkInDate);
        System.out.println("객실 번호 : " + roomNumber + "호");

    }
}
