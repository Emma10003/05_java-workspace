package edu.io.pack5.ex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 이미지URL서비스 {

    public void dirSaveImg(String imgUrl, String imgDir, String imgName){
        Path imgPath = Path.of("profiles", imgDir, imgName);
        System.out.println("path: " + imgPath);
        System.out.println("path.getParent(): " + imgPath.getParent());

        // 파일 이름 중복 처리
        try {
            // path : animal/사자.png
            // path.getParent()   : 파일명 외의 상위 폴더들을 모두 가져오는 기능
            // path.getFilename() : 마지막에 존재하는 파일명을 가져오는 기능
            // 이름 뒤에 확장자가 오면, 확장자를 지운 후 수정 작업 필요
            String name = imgPath.getFileName().toString(); // 파일이름 가져오기 (.toString()으로 문자열 처리)
            System.out.println("name: " +  name);

            // 확장자와 이름 분리
            int dot = name.lastIndexOf('.'); // '.'을 기준으로 앞에 있는 글자만 가져오겠다.
            String baseName = name.substring(0, dot); // '.' 이전의 파일 명칭들이 존재
            String extName = name.substring(dot);
            // String .substring(int index) : 특정 인덱스 값 부터 끝까지 문자열 슬라이싱
            // String .substring(int start_index, int end_index)

            int count = 1;
            do {
                //               사용자가작성한이름_숫자.png
                String newName = baseName + "_" + count + extName;
                imgPath = Path.of(imgDir, newName);
                count++; // 사자_8 ... 동일한 명칭의 파일이 없을 때 까지 진행
            } while(Files.exists(imgPath));

            System.out.println("baseName: " + baseName); // 사자
            System.out.println("extName: " + extName); // .png (확장자 명칭)

            Files.createDirectories(imgPath.getParent());

            URL url = new URL(imgUrl);
            InputStream inputStream = url.openStream(); // 이미지 데이터를 모두 가져올 수 있도록 설정
            Files.copy(inputStream, imgPath);

            inputStream.close();

            System.out.println("사진 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("사진 저장 도중 오류가 발생했습니다.");
        }
    }
}
