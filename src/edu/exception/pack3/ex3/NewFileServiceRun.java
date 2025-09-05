package edu.exception.pack3.ex3;

import java.io.File;
import java.io.IOException;

public class NewFileServiceRun {
    // Java 는 컴퓨터와 직접적으로 연관이 있는 서버 언어로,
    // 파일 생성, 삭제, 수정과 같이 컴퓨터에 직접적으로 영향을 주는
    // 코드 작업이 가능하다!
    // ------------------------------------------------------------
    // JavaScript 는 웹에 직접적으로 영향을 주는 웹 관련 언어로,
    // 파일 생성이나 삭제, 수정과 같은 작업이 Java 보다는 사용하기 어려움.
    // nodeJs 라는 프레임워크(라이브러리) 도구를 활용하면 가능하긴 하다!
    
    // 월요일 - IO 입출력
    public static void main(String[] args){
        // File 이라는 자바 개발자들이 만든 문서를 활용해서
        // 파일을 생성하기

        // 파일 만들기를 할 때 자동으로 덮어쓰기 되므로, 파일 존재유무를 확인하고
        // 파일 명칭이 존재하면 (1) 이런 식으로 뒤에 번호를 붙임
        File file = new File("새 텍스트 문서.txt");
        if(!file.exists()){ // 생성된.txt 가 존재하지 않는 게 사실이라면
            try {
                file.createNewFile(); // 파일을 생성하는 메서드
                System.out.println("file 생성이 완료되었습니다.");
            } catch (IOException e) {
                System.out.println("파일을 생성하는 도중 문제가 발생했습니다.");
            } catch (Exception e){
                System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
                // 문제가 무엇인지는 e 라는 변수명을 통해 확인
                System.out.println("err : " + e);
                e.printStackTrace(); // 예외정보 + 예외가 발생한 위치까지의 메서드 추적
            } finally {
                System.out.println("파일 생성을 종료합니다.");
            }
        }
    }
}
