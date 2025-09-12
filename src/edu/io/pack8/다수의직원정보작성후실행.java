package edu.io.pack8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
class EmployeeFileWriter
 */
public class 다수의직원정보작성후실행 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("직원 정보를 입력하세요. (종료를 입력하면 파일이 생성됩니다: ");
        
        while(true) {
            System.out.println("직원이름: ");
            String name = sc.nextLine();
            
            if(name.equals("종료")) {
                break;  // 기능 중지
            }

            System.out.println("부서이름: ");
            String 부서 = sc.nextLine();
            System.out.println("직급: ");
            String 직급 = sc.nextLine();
            
            sb.append("이름: " + name + ", 부서: " + 부서 + ", 직급: " + 직급 + "\n");

            System.out.println("입력 완료되었습니다. 다음 직원 정보를 입력하거나 종료를 입력하세요.");
            
        }

        // 종료를 입력하면
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
