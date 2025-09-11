package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercise2 {
    // 문제 1. 학생 정보 파일 생성과 관리
    public void solution1(){
        Path studentDir = Path.of("student");
        Path filePath = Path.of("info.txt");
        // StringBuilder 로 파일 내에 저장할 텍스트 넣기
        StringBuilder content = new StringBuilder("이름: 홍길동" +
                "\n나이: 25" +
                "\n전공: 컴퓨터공학" +
                "\n학년: 3학년");

        try {
            Files.createDirectories(studentDir); // 경로가 없다면 생성
            // .writeString() : (파일 내에, 내용 작성)
            Files.writeString(filePath, content.toString()); // 경로에 해당하는 파일에 content를 문자열로 넣기
            System.out.println("학생 정보 파일이 생성되었습니다.");
            System.out.println("=== 파일 내용 ===");
            // .readString() : 어떤 파일을 읽을 것인지 (파일 경로만 작성)
            // => 읽는 용도가 맞으나, 컴퓨터가 읽은 것이지
            //    읽은 내용을 클라이언트 눈에 보여줄 의무는 없음!! 보여주려면 sout 사용.
            System.out.println(Files.readString(filePath));
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
        }
    }

    // 문제 2. 인터넷에서 텍스트 데이터 다운로드
    public void solution2(){
        Path textDir = Path.of("downloads", "text", "downloaded_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";

        try {
            Files.createDirectories(textDir.getParent());

            URL url = new URL(textUrl);
            InputStream inputStream = url.openStream();
            if(!Files.exists(textDir)){ // 파일이 존재하지 않을 때에만 아래 파일을 저장.
                Files.copy(inputStream, textDir); // 파일 저장 (inputStream으로 가져온 데이터를 textDir 에 넣어준다.
                // Files.copy(url.openStream(), textDir); => inputStream 을 이렇게 한 번에 작성 가능
            }
            inputStream.close();

            System.out.println("텍스트 다운로드 완료: " + textDir);
            System.out.println(Files.readString(textDir));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 문제 3. 중복 파일명 자동 처리
    public void solution3(){
        Path backupDir = Path.of("backup");  // 1번) 경로 설정하기

        String baseName = "document"; // 확장자 제외 파일명
        String extension = ".txt"; // . 포함 확장자
        String content = "이것은 백업 문서입니다.";
        int counter = 1;
        Path textDir = backupDir.resolve(baseName + extension); // 폴더경로 + 파일명 -> 최종 파일 경로
        // 근데 resolve 는 많이 쓰는 편이 X!
        // 기존 경로 + 파일 명칭을 이어 작성할 때 주로 사용하는 메서드이지만
        // 보통 경로를 설정할 때 처음부터 Path.of 에 파일 명칭을 포함한 완벽한 경로를 설정하기 때문!
        // -> FileEx1의 '회사에서사진저장하는기능1()' 이나 kakaoTalk 처럼 미리 경로를 변수로 설정해두고...

        // 파일 생성
        try {
            Files.createDirectories(backupDir); // 2번) 폴더 존재유무 확인 후 생성

            // 이미 중복 파일이 존재하는 경우 파일명 변경 처리
            while(Files.exists(textDir)) {
                String newName = baseName + "_" + counter + extension; // '_숫자' 추가해서 저장
                textDir = backupDir.resolve(newName);
                counter++; // 추후 문제가 생겼을 경우 실행할 작업은 맨 아래에 작성
            }
            System.out.println(textDir);
            Files.writeString(textDir, content);
            System.out.println(textDir.getFileName() + " 파일이 완성되었습니다.");

            System.out.println("파일이 저장되었습니다.: " + textDir.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 문제 4.
    /*
    1단계: temp 폴더에 data.txt 파일 생성 (내용: "중요한 데이터 파일")
    2단계: archive 폴더와 backup 폴더 생성
    3단계: temp/data.txt를 archive/data.txt로 이동
    4단계: 동시에 backup/data_backup.txt로 복사
     */
    public void solution4(){

        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");

        try {
            // 1단계 : 임시파일 생성
            Files.createDirectories(tempDir);
            Files.writeString(sourceFile, "임시데이터");
            System.out.println("1단계: 임시 파일 생성 완료: " + sourceFile);

            // 2단계 : 폴더 생성
            Files.createDirectories(archiveDir);
            Files.createDirectories(backupDir);
            System.out.println("2단계: 폴더 생성 완료: " + archiveDir.getFileName() + ", " + backupDir.getFileName());

            // 3단계 : 파일 이동
            Files.move(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계: 파일 이동 완료: " + sourceFile + " -> " + targetFile);

            // 4단계 : 백업 복사
            Files.copy(targetFile, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계: 백업 복사 완료: " + backupFile);

            System.out.println("모든 작업이 완료되었습니다.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 문제 5.
    public void solution5(){}

}
