package edu.practice.day15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 회원 정보 클래스
 */
public class Member {
    // 필드
    private String id;          // 회원 아이디
    private String password;    // 비밀번호
    private String name;        // 이름
    private String email;       // 이메일
    private String phone;       // 전화번호
    private String imageUrl;    // 이미지 URL
    private String joinDate = getCurrentTime();    // 가입일시
    private String lastLogin = getCurrentTime();   // 마지막 로그인 (빈 문자열)

    // 생성자
    public Member() {
    }
    public Member(String id, String password, String name, String email, String phone, String imageUrl) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }
    public Member(String id, String password, String name, String email, String phone, String imageUrl, String joinDate, String lastLogin) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.joinDate = joinDate;
        this.lastLogin = lastLogin;
    }

    // getter, setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    public String getLastLogin() {
        return lastLogin;
    }
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    // 개발자 정의 메서드
    /**
     * 현지 시간 반환 메서드
     * @return yyyy-MM-dd HH:mm:ss 형식으로 현재 시간 반환
     */
    private String getCurrentTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 파일 저장 형식으로 변환하는 메서드
     * @return 모든 필드를 "|"로 구분하여 하나의 문자열로 반환
     */
    public String toFileFormat(){
        // // 입력받기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("아이디: ");
        // id = sc.nextLine();
        // System.out.print("비밀번호: ");
        // password = sc.nextLine();
        // System.out.print("이름: ");
        // name = sc.nextLine();
        // System.out.print("이메일: ");
        // email = sc.nextLine();
        // System.out.print("이미지 URL: ");
        // imageUrl = sc.nextLine();
        // // 가입일시
        // joinDate = getCurrentTime();
        // lastLogin = getCurrentTime();

        return String.format("%s|%s|%s|%s|%s|%s|%s|", getId(), getPassword(), getName(), getEmail(), getPhone(),
                getImageUrl(), getJoinDate(), getLastLogin());
    }

     /**
     * 파일에서 읽은 문자열을 Member 객체로 변환하는 Static 메서드
     * @param line : 파일에서 읽어올 문자열 (한 줄)
     * @return member 객체
     */
    public static Member fromFileFormat(String line) {
        // line.split("\\|")으로 분리하여 Member 객체 생성
        // 8개 요소가 있을 때만 객체 생성, 아니면 null 반환

        // item 배열: [id, password, name, email, phone, imageUrl, joinDate, lastLogin]
        String[] item = line.split("\\|");  // 필드 데이터를 분리해서 배열로 반환

        if(item.length == 8) {
            Member member = new Member(); // 새로운 객체를 생성
            member.setId(item[0]); // 배열의 각 인덱스 데이터를 생성된 객체의 필드로 저장 
            member.setPassword(item[1]);
            member.setName(item[2]);
            member.setEmail(item[3]);
            member.setPhone(item[4]);
            member.setImageUrl(item[5]);
            member.setJoinDate(item[6]);
            member.setLastLogin(item[7]);

            return member; // 필드가 저장된 객체를 메서드가 호출된 자리로 반환
        } else {
            System.out.println("8개의 파라미터가 존재해야 합니다.");
            return null;
        }
    }
}
