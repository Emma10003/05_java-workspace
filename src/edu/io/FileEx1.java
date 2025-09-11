package edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEx1 {

    // 예전에는 사용자가 컴퓨터나 핸드폰, 디바이스 기기에 저장한 명칭을 최대한 사용하여
    // 회사 내부에 파일을 저장했음      사용자사진_1, 사용자사진(1), 사용자사진_현재시간 과 같은 방법을 사용
    // => 코드가 너무 길어지고 사진을 관리하기가 어려워짐
    // 파일 명칭을 사용자에게 맞추는 것이 아니라, 회사 규율에 맞게 사진을 저장하여
    // 사용자의 프로필사진이나 갤러리에서 사진을 확인할 수 있도록 기능 설정.
    public void 고전방식(){
        String originName = "사용자가 저장한 사진이름.png";

        Path path = Path.of("회사에서 사용자가 업로드한 파일을 저장할 폴더 위치", originName);

        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        while (Files.exists(path)) {
            String newName = baseName + " (" +  System.currentTimeMillis() + ")" + extName;
            System.out.println("newName: " + newName);

            path = Path.of("회사에서 사용자가 업로드한 파일을 저장할 폴더 위치", newName);

        }

        try {
            Files.createDirectories(path.getParent());
            String imgUrl = "https://cdn-icons-png.flaticon.com/512/8633/8633238.png";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void 회사에서사진저장하는기능1(String imgUrl){
        String 회사에서사용할기본Name = "회사이름_" + System.currentTimeMillis() + ".jpg"; // 현재시간으로 저장하는 게 ㅋ요새 트렌드
        Path path = Path.of("C:", "회사이름", 회사에서사용할기본Name);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            in.close();
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void 회사에서사진저장하는기능2(String imgUrl){
        String 회사에서사용할기본Name = "회사이름_" + System.currentTimeMillis() + ".jpg"; // 현재시간으로 저장하는 게 ㅋ요새 트렌드
        Path path = Path.of("C:", "회사이름", 회사에서사용할기본Name);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            // InputStream in = url.openStream();  => 사용해도 되긴 하지만
            // 데이터를 여러번 사용하고 작업할 일이 존재하지 않으면
            // 아래와 같이 한 번에 작성하여 저장해도 문제 없이 저장이 잘 됨
            //      Files.copy(url.openStream(), path);  로 파일 가져오고, 가져온 파일 저장까지 한 번에 완성 가능!
            //          inputStream에서 가져온 이미지 데이터가 존재하는 위치  회사 컴퓨터에 저장할 위치 + 파일명
            Files.copy(url.openStream()                                   , path);
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /*********************************************
                InputStream 의 변천사
    *********************************************/
    public void defaultInputStream(){
        try {
            
            Path path = Path.of("폴더위치/파일이름.확장자이름");
            URL url = new URL("이미지주소");
            InputStream inputStream = url.openStream();
            // 한 번에 데이터를 가져올 수 있는 최대 공간 크기
            // 1KB = 1024
            // 1MB = 1024 * 1024 번 갖고오기
            byte[] buffer = new byte[1024]; // 최대 1024 byte씩 가져올 수 있다.
            FileOutputStream outputStream = new FileOutputStream(path.toFile()); // 주소에서 가져온 파일이름

            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            inputStream.close();
            outputStream.close();

        } catch (MalformedURLException e) {
            System.out.println("InputStream 에서 데이터를 가져올 수 있도록 문 열어주기(openStream)에서 발생하는 문제들");
        } catch (IOException e) {
            System.out.println("url 연결부터 발생할 수 있는 각종 IO 관련 문제들");
        }
    }

    public void 경로결합(){
        Path dir = Path.of("폴더1/폴더2");

        Path file = dir.resolve("파일이름.txt");

        // resolve() : 기존 경로와 새로운 경로 혹은 파일을 결합하는 기능
        // file에는 폴더1/폴더2/파일이름.txt 로 결합된 경로가 저장되어 있음.
    }

}
