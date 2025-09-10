package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 중복된_파일_폴더명칭_Service {
    public void saveImage1(){
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01", originName);

        int dot = originName.lastIndexOf('.'); // . 이 몇 번째 인덱스에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일명의 0번 인덱스부터 . 인덱스 전 까지의 파일명칭을 가져옴
        String extName = originName.substring(dot); // .확장자명 을 가지고 있는 상태
        System.out.println("dot . 의 위치: " + dot);
        System.out.println("baseName의 위치: " + baseName);
        System.out.println("extName의 위치: " + extName);

        int count = 1;
        do{
            //               사진         (      숫자     )    .png
            String newName = baseName + " (" +  count + ")" + extName;
            System.out.println("newName: " + newName);

            path = Path.of("profiles", "member01", newName); // 기존이름 -> 숫자가 붙은 이름으로 변경
            count++;  // 사진(1) 이 존재하면 숫자를 계속 올려서 존재하지 않는 이름이 나올 때 까지 숫자값 상승

        } while (Files.exists(path)); // 파일이름이 존재하면, 존재하는 파일이름이 없을 때 까지 반복

        try {
            Files.createDirectories(path.getParent()); // profile/member01 까지만 포함
            String imgUrl = "https://cdn-icons-png.flaticon.com/512/8633/8633238.png";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream 을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
