package edu.io.pack4.run;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 파일생성삭제실행 {
    // createFolder

    // createFile

    // 각 메서드 생성 후
    // createFolder 를 이용해서 file/store 이라는 폴더 생성

    // createFile 에서는

    // file/store 폴더가 존재하는지 확인하고
    // 존재하면 Book.txt 파일 생성

    // '더조은책방 - 책 리스트' 추가 후
    // 생성 완료까지 확인

    public void createFolder() {
        Path path = Path.of("files", "store"); // files/store 폴더 생성

        try {
            Files.createDirectories(path);
            System.out.println("폴더 생성이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("폴더 생성이 올바르지 않습니다.");
        }
    }

    public void createFile() {
        Path path = Path.of("files", "store", "Book.txt");

        if(Files.isDirectory(path)){

        }
    }
}
