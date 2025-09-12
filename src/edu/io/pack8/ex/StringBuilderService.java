package edu.io.pack8.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {
    Scanner sc = new Scanner(System.in);

    // 문제 1 : 도서 정보 저장하기
    public void saveBooks(){
        Path bookDir = Path.of("books");
        Path bookFile = Path.of("books", "book_list.txt");
        StringBuilder bookData = new StringBuilder();

        try {
            Files.createDirectories(bookDir); // 폴더 생성

                System.out.println("=== 도서 정보 입력 (완료를 입력하면 저장됩니다) ===");
            while(true){
                // 입력받기
                System.out.print("제목: ");
                String title = sc.nextLine();

                if (title.equals("완료")) {
                    break;
                }

                System.out.print("저자: ");
                String author = sc.nextLine();
                System.out.print("출판년도: ");
                int year = sc.nextInt();
                sc.nextLine();

                bookData.append("제목: " + title + ", 저자: " + author + ", 출판년도: " + year + "\n");
                System.out.println("입력 완료!");
            }

            Files.writeString(bookFile, bookData); // while 로 데이터를 추가하는 동안은
            // 파일 아래에 지속적으로 추가되지만,
            // saveBook 을 여러 번 실행하면
            // 이전 데이터에 새로운 데이터가 누적되는 것이 아니라 초기화된 상태로 새로운 데이터가 저장됨.
            // -> StandardOpenOption 을 설정하지 않았기 때문!
            // 이어쓰기인지, 매번 새로운 파일을 만드는지 - 파일을 만드는 목적을 확인하고 옵션 설정할 것!

            System.out.println("도서 목록이 저장되었습니다: " + bookFile.getFileName());
            System.out.println("=== 저장된 내용 ===");
            System.out.println(Files.readString(bookFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 문제 2: 학생 성적 관리 (날짜별로 저장)
    public void manageGrades(){
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path gradeDir = Path.of("grades");
        Path gradeFile = Path.of("grades", today + "_성적표.txt");
        StringBuilder gradeData = new StringBuilder();

        try {
            // 1. 폴더 확인 및 생성
            Files.createDirectories(gradeDir);
            System.out.println(gradeDir + " 폴더 생성되었습니다.");
            System.out.println("=== 학생 성적 입력 (종료를 입력하면 저장됩니다) ===");

            while (true) {
                // 입력받기
                System.out.print("이름: ");
                String name = sc.nextLine();

                if(name.equals("종료")) {
                    break; // 반복 중단
                }

                System.out.print("국어: ");
                int kor = sc.nextInt();
                sc.nextLine();
                System.out.print("영어: ");
                int eng = sc.nextInt();
                sc.nextLine();
                System.out.print("수학: ");
                int math = sc.nextInt();
                sc.nextLine();
                
                double average = (kor + eng + math) / 3.0;

                gradeData.append("이름: " + name + ", 국어: " + kor + ", 영어: " + eng +
                        ", 수학: " + math + ", 평균: " + average + "\n");
            }
            
            // 모든 입력이 끝나고 '종료'를 작성했다면
            Files.writeString(gradeFile, gradeData); // gradeData.toString() 도 가능
            System.out.println("오늘 성적표가 작성되었습니다: " + gradeFile.getFileName());
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 문제 3: 가계부 기록 남기기
    public void recordCount(){
        Path householdDir = Path.of("household");
        Path accountFile = Path.of("household", "account_book.txt");
        String timestamp = getCurrentTime();
        StringBuilder accountData = new StringBuilder();
        System.out.println("=== 가계부 내역 입력 (끝 입력 시 저장됩니다) ===");

        try {
            Files.createDirectories(householdDir);

            while(true) {
                // 입력받기
                System.out.print("항목: ");
                String cate = sc.nextLine();

                if(cate.equals("끝")) {
                    break;
                }

                System.out.print("금액: ");
                int price = sc.nextInt();
                sc.nextLine(); // 숫자나 소수자리는 작성한 뒤에 줄바꿈 처리가 되기 때문에 nextLine()으로 버퍼 처리
                System.out.print("수입/지출: ");
                String whetherIncome = sc.nextLine();

                accountData.append(timestamp + " - " + cate + ": " + price + "원" + " (" + whetherIncome + ")\n");
            }

            Files.writeString(accountFile, accountData, StandardOpenOption.CREATE,  StandardOpenOption.APPEND);
            System.out.println("가계부 기록이 추가되었습니다.");
            System.out.println("=== 전체 가계부 기록 ===");
            System.out.println(Files.readString(accountFile));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
