package edu.io.pack3.service;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService3 {
    public void 고전방식(){
        File file = new File("files/파일2.txt");
        if(!file.exists()){
            System.out.println("파일이 존재하지 않습니다.");
            return; // 파일이 존재하지 않기 때문에 기능 멈춤 처리
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            
            // 가져온 파일에 있는 글자들이 null 값일 때 까지 한 줄씩 읽고 출력
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("읽을 수 있는 파일이 존재하지 않습니다.");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했을 때의 로직 작성");
        } finally {
            if(br != null){
                try{
                    br.close(); // 모두 읽은 파일을 닫을 때 문제가 발생할 수 있으니 try-catch 로 시도한 후
                                // 발생한 문제에 대한 처리 로직을 catch 에 작성
                } catch (Exception e) {
                    System.out.println("파일이 다른 곳에서 사용중이기 때문에 닫을 수 없습니다.");
                }
            }
        }
    }


    public void 현대방식(){ // 훨씬 더 코드가 간단하다~
        Path path = Path.of("files", "파일2.txt"); // 폴더와 파일을 구분, 알아서 / 가 붙음

        if(!Files.exists(path)) {
            System.out.println("파일 없음");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
            // 파일을 다 읽으면 알아서 닫히므로 닫는다, 안 닫는다 설정할 필요가 없음.
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 발생하는 문제에 대해 처리할 로직을 작성하는 곳");
        }
    }
}




















