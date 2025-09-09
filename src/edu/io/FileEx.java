package edu.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileEx {
    /*
    FileInputStream    - 컴퓨터에 존재하는 파일 확인 클래스
    FileOutputStream   - 파일 저장 클래스
    BufferedReader     - 파일에 글을 작성하거나 읽을 수 있도록 도와주는 클래스
    
    파일 읽기 관련
    FileInputStream  : 파일의 바이트 데이터를 읽어오는 클래스
    FileReader       : 파일의 텍스트 데이터를 문자 단위로 읽는 클래스
    BufferedReader   : 파일의 텍스트를 버퍼에 담아 효율적으로 읽는 클래스
    Scanner          : 파일의 데이터를 다양한 형태로 파싱하여 읽는 클래스

    파일 쓰기 관련
    FileOutputStream : 파일의 바이트 데이터를 저장하는 클래스
    FileWriter       : 파일의 텍스트 데이터를 문자 단위로 저장하는 클래스
    BufferedWriter   : 파일의 텍스트를 버퍼에 담아 효율적으로 저장하는 클래스
    PrintWriter      : 파일의 다양한 형태의 데이터를 편리하게 저장하는 클래스

    파일 정보 및 관리
    File             : 파일이나 폴더의 존재 여부, 정보 확인하는 레거시 클래스
    Files            : 파일 생성, 삭제, 복사 등 모든 파일 작업을 담당하는 유틸리티 클래스
    Path             : 파일 경로를 나타내고 조작하는 현대적 클래스
    Paths            : Path 객체를 생성하는 팩토리 클래스


    *레거시(Legacy)    : 오래된, 예전 방식의, 구식의 - 전통 방식(기본)!
    *팩토리(Factory)   : 인터페이스를 활용하여 클래스 형태로 만들어지고,
                        만들어진 클래스를 객체 형태로 사용할 수 있도록 만들어주는 클래스나 메서드 기능
    *유틸리티(Utility) : 편리한 기능들을 모아놓은 클래스
     */
    
    /*
    레거시(Legacy) 클래스 비교하기

    왜 레거시라고 부르는가?!
    -> 오래돼서 문제가 많지만, 기존 코드와의 호환성 때문에 아직 남아있음.
       새 프로젝트에서는 잘 사용하진 않음
     */
    public void legacyMethod(){
        // 레거시 방식 (1995년 부터) - 오래되고 불편함
        File file = new File("폴더경로/파일이름.확장자명");
        boolean exists = file.exists();        // 예외처리 안됨, 그냥 true/false 만 진행
        boolean success = file.delete();
        if(!success){
            // 삭제를 못한 게 사실이라면
            // 왜 삭제를 못했는가? - 권한이 없어서? 다른 프로그램에서 사용중인지?
            // 개발자가 코드를 수정함에 있어 어떻게 문제를 수정하고 대안을 설정해야 하는지에 대한 정보가 없음
            System.out.println("삭제... 실패... 이유... 모름...");
        }
        
        // 기타 문제들
        // File 클래스는 느리다!
        // 시스템에서 직접적으로 콜 하기 때문에 위험성 높음
        // copy(), move(), readAllText() - 파일복사, 파일이동, 파일 내 모든 텍스트 읽기 등 다수의 기능이 없음

        // 현대적 방식 (2011년 부터) - 새롭고 편리함
        Path path = Path.of("폴더경로/파일이름.확장자명");
        boolean exists2 = Files.exists(path);  // 더 안전하고 상세 기능이 많음
        try {
            Files.delete(path);
        } catch(NoSuchFileException e) {
            System.out.println("파일이 없습니다: -> 파일이 없을 때 어떻게 진행해야 하는지에 대해 개발자가 작성");
        } catch(AccessDeniedException e) {
            System.out.println("권한이 없습니다: -> 이럴 경우 개발자가 어떻게 처리해야 하는지에 대해 작성");
        } catch (IOException e) {
            System.out.println("입출력 연결문제 오류: -> 개발자가 어떻게 처리해야 하는지 진행");
        } catch(Exception e){
            System.out.println("개발자가 알지 못하는 문제 발생: -> 해당 문제에 대해 추가 catch를 추후 처리");
        }
    }
    
    /*
    팩토리 패턴
     */
    public void factoryMethod(){
        // 레거시 버전 - Windows, MacBook, Linux 별로 / 를 쓰거나 \\ 를 사용해서
        //              윈도우와 맥북, 리눅스 환경을 구분해야 해서 좋은 방식이 아님.
        File file1 = new File("폴더경로/파일이름.확장자명");
        File file2 = new File("폴더경로", "/파일이름.확장자이름");

        // 현대 버전 - Windows, MacBook, Linux 를 자바 코드에서 운영체제를 읽고 콤마(,) 사이 중간을
        //            알아서 윈도우, 맥북, 리눅스에 각각 필요한 형태로 슬래시(/) 를 작성

        // Windows 에서      : User/user/file.txt
        //                    User\\user\\file.txt 와 같은 형태의 슬래시(/)가 알아서 생성
        // Linux or Mac 에서 : Users/user/file.txt 와 같은 형태의 슬래시(/)가 알아서 생성

        // Paths 팩토리의 경우
        Path path1 = Paths.get("file.txt"); // 파일만 필요할 때 사용
        Path path2 = Paths.get("C:","폴더이름", "file.txt"); // 최상위 폴더 / 중간폴더 / 파일명

        // Java 11 버전부터 사용되는 최신 방법
        // Paths 와 Path 를 구분하지 못한 채 사용하는 경우가 많아, Path 라는 명칭으로 통일해서
        // 폴더이름 파일이름.확장자명 의 경로를 사용할 수 있도록 설정된 기능.
        Path path3 = Path.of("file.txt");

        // 절대경로 (전체적인 경로)
        Path 절대경로1 = Path.of("C:", "Users", "user", "Desktop", "file.txt");
        Path 절대경로2 = Path.of("/", "home", "user", "Desktop", "file.txt");

        // 상대경로 (현재 자바를 실행하고 있는 폴더 위치 기준)
        Path 상대경로1 = Path.of("file.txt"); // java_basic 폴더에서 파일 선택
        Path 상대경로2 = Path.of("src","file.txt"); // java_basic 폴더에서 src 폴더 아래에 위치한 file.txt
        Path 상대경로3 = Path.of("..","file.txt"); // java_basic 폴더에서 폴더를 감싸고 있는 java_workspace 폴더를 가리킴
        Path 상대경로4 = Path.of(".", "path1", "file.txt"); // 현재 폴더에서 path1 이라는 폴더 안에 존재하는 file.txt
    }


    /*
    유틸리티 클래스 및 메서드 기능
    유틸리티 : 편리한 도구들의 모음집
     */
    public void utilityMethod(){
        // 클래스 기반 유틸리티
        try {
            // File 에는 존재하지 않지만 Files 에는 존재하는 기능들
            Files.copy(Path.of("원본"), Path.of("사본"));
            Files.move(Path.of("원본"), Path.of("사본"));
            Files.delete(Path.of("사본"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 메서드 유틸리티
        double 결과1 = Math.max(10, 20);
        double 결과2 = Math.sqrt(10); // 제곱근
        double 결과3 = Math.random();

        ArrayList list = new ArrayList();
        // 정렬 뒤집기
        Collections.sort(list); // 정렬 도구
        Collections.reverse(list); // 정렬 뒤집기 도구
    }
}
