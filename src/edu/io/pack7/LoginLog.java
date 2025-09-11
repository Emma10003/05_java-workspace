package edu.io.pack7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
로그인, 로그아웃을 기록하기
위치
- Mac : /User/
- Windows : C://더조은회사로그파일/
 */
public class LoginLog {

    public void login(){
        Path path = Path.of("C:", "더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());
            System.out.println("로그인 기록 파일이 생성되었습니다.");

            // Files.writeString(path, "유저가 로그인한 정보\n"); // StandardOpenOption 이 아무것도 없을 때는 기본값 : CREATE
            // Files.writeString(path, "유저가 로그인한 정보\n", StandardOpenOption.CREATE); // 무조건 파일 다시만들기
            // Files.writeString(path, "유저가 로그인한 정보\n", StandardOpenOption.APPEND); // 무조건 파일 내 내용에 이어서 작성하기
            String loginInfo =  현재시간가져오기() + "유저가 로그인한 정보\n";
             Files.writeString(path, loginInfo,StandardOpenOption.CREATE, StandardOpenOption.APPEND); // 파일이 없으면 생성하고, 이어서 작성하기
            System.out.println("유저가 로그인한 정보를 작성 완료했습니다. -- 개발자가 단순코드 동작 확인용 출력문");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logout(){
        Path path = Path.of("C:", "더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());

            String logoutInfo =  현재시간가져오기() + "유저가 로그아웃한 정보\n";
            Files.writeString(path, logoutInfo,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("유저가 로그아웃한 정보를 작성 완료했습니다. -- 개발자가 단순코드 동작 확인용 출력문");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 로그인하고, 로그아웃한 시간 기록하기
    public String 현재시간가져오기(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void 시간비교(){
        long a = System.currentTimeMillis();
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println("a: " + a);
        System.out.println("now: " + now);
    }
    /*
    System.currentTimeMillis() : 1970년 01월 01일 00 분 00초 부터 흐른 시간을 숫자로 표현
    
    LocalDateTime.now() : 현재시간을 문자열 형태로 출력
    
    DateTimeFormatter.ofPattern("회사에서 출력하기 원하는 시간 형태") : 현재시간 출력 형태가 마음에 들지 않을 때
                                                                    회사에서 원하는 출력 형태로 변환 
    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                                                             년  월  일 시 분 초   형태로 출력해달라 설정
     */
}
