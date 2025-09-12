package edu.io.pack8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
class EmployeeFileWriter
 */
public class 다수의직원정보작성 {

    /*
    String str = sc.nextLine();
    str += "이름: " + name + ", 부서: " + 부서 + ", 직급: " + 직급 + "\n";
    Files.writeString(path, str);

    직원 정보를 추가할 때 마다 메모리 상에서는 str 이 [종료] 라는 글자를 작성하기 전까지 생성되고,
    기존에 있던 str 공간은 가비지컬렉션에 의해서 삭제됨
    생성 -> 기존 str 삭제 -> 생성 -> 기존 str 삭제 ... 반복
     */
    public void stringMethod(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("직원 정보를 입력하세요. (종료를 입력하면 파일이 생성됩니다: ");
        
        while(true) {
            System.out.print("직원이름: ");
            String name = sc.nextLine();
            
            if(name.equals("종료")) {
                break;  // 기능 중지
            }

            System.out.print("부서이름: ");
            String 부서 = sc.nextLine();
            System.out.print("직급: ");
            String 직급 = sc.nextLine();

            str += "이름: " + name + ", 부서: " + 부서 + ", 직급: " + 직급 + "\n";

            System.out.println("입력 완료되었습니다. 다음 직원 정보를 입력하거나 종료를 입력하세요.");
            
        }

        // 종료를 입력하면 파일 저장
        Path path = Path.of("files", "employee.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, str);

            System.out.println("파일이 성공적으로 생성되었습니다: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e); 
        }
    }


    /*
    StringBuilder sb = new StringBuilder();
    sb.append("이름: " + name + ", 부서: " + 부서 + ", 직급: " + 직급 + "\n");
    Files.writeString(path, sb.toString());
    
    문자열 생성이 모두 완료될 때 까지 데이터를 추가할 수 있으며,
    종료를 작성하여 데이터 추가 작업을 종료하면 최종적으로 추가된 문자열을 기반으로 파일에 데이터 저장
    
    String  = 문자열로 이루어진
    Builder = 빌딩
    한 공간 안에 문자열 탑을 만들겠다... 는 명칭
     */
    public void builderMethod(){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("직원 정보를 입력하세요. (종료를 입력하면 파일이 생성됩니다: ");

        while(true) {
            System.out.print("직원이름: ");
            String name = sc.nextLine();

            if(name.equals("종료")) {
                break;  // 기능 중지
            }

            System.out.print("부서이름: ");
            String 부서 = sc.nextLine();
            System.out.print("직급: ");
            String 직급 = sc.nextLine();

            sb.append("이름: " + name + ", 부서: " + 부서 + ", 직급: " + 직급 + "\n");

            System.out.println("입력 완료되었습니다. 다음 직원 정보를 입력하거나 종료를 입력하세요.");

        }

        // 종료를 입력하면 파일 저장
        Path path = Path.of("files", "employee.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, sb.toString());

            System.out.println("파일이 성공적으로 생성되었습니다: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
