package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class 프로필사진service {


    // 1으로 끝나는 명칭들만 이용해서 member03 폴더, member04 폴더에 각각 프로필사진2.txt 저장
    public void createProfileFolder(String memberId, String profilePicture){
        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", memberId);
        // Path memberFolder2 = Path.of("profiles", "member02");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
            // Files.createDirectories(memberFolder2);

            // 3. 폴더 내에 프로필 사진 저장하기
            Path picture1 = Path.of("profiles", memberId, profilePicture);
            // Path picture2 = Path.of("profiles", "member02", "프로필사진02.txt");

            Files.writeString(picture1, "프로필 사진 이미지입니다.");
            // Files.writeString(picture2, "프로필 사진 이미지입니다.");

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생했을 때 문제 해결");
            // 1) 메인 서버가 끊기면 두 번째 후보 서버로 저장 시작
            // 2) 이미지가 5MB 이상 초과되면 저장 못하게 하고, 5MB 초과할 수 없음을 사용자에게 알리기
        }
    }

    // 이미지 주소로 이미지 저장하기
    public void saveImg(String imgUrl){
        // String imgUrl = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", "member06");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1); // 폴더 생성
            Path picture1 = Path.of("profiles", "member06", "사진1.png"); // 저장할 파일 경로 지정

            // 4. 이미지 주소에서 이미지 다운로드 처리 후
            System.out.println("이미지 다운로드 중 . . . ");
            // URL : 클라이언트가 작성한 이미지 주소를 Java에서 (읽거나 쓰거나) 사용할 수 있도록 설정하는 문서
            URL url = new URL(imgUrl);
            // InputStream   : 인터넷에서 데이터가 흘러들어오는 통로를 만듦
            // .openStream() : 이미지 주소에서 데이터가 들어올 수 있도록 통로를 열어두는 기능
            InputStream inputStream = url.openStream();

            // 5. 파일로 저장하기
            // .copy() : 인터넷에 존재하는 이미지를 내 컴퓨터에 복제
            // StandardCopyOption : 선택사항 - 기존에 이미지이름이 존재하면 덮어쓰기 형태로 이미지이름에 현재 저장하는 이미지 데이터를 저장.
            Files.copy(inputStream, picture1, StandardCopyOption.REPLACE_EXISTING);
            // 데이터를 모두 가져오고, 가져온 데이터를 복사해서 내 컴퓨터에 저장이 완료되면,
            // 데이터가 들어올 수 있는 통로를 닫아두기 설정해야 저장이 완료됨.
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생했을 때 문제 해결");
        }
    }
    
    // profiles/member07 내부에 복사한 이미지 저장하기
    public void saveImg2(String imgUrl){
        // 1. 회원폴더 경로 저장
        Path memberFolder = Path.of("profiles", "member07");

        try {
            // 2. 폴더 생성
            Files.createDirectories(memberFolder);
            // 3. 저장할 파일(프로필 파일) 경로 저장
            Path picture = Path.of("profiles", "member07", "picture01.png");

            // 4. 이미지 주소에서 이미지 다운로드
            // 인터넷 주소에서 이미지를 다운로드 할 수 있도록
            // String 으로 가져온 문자열 주소가 인터넷 상에 존재하는 주소임을 설정하는 URL 클래스 사용
            System.out.println("이미지 다운로드 중...");
            URL url = new URL(imgUrl); // String 문자열에 담긴 글자가 url 주소임을 설정함.
            // 데이터 가져오기       = 인터넷주소에서.데이터를 가져올 수 있도록 열어놓기
            InputStream inputStream = url.openStream(); // 이미지 다운로드 할 수 있도록 통로 만들고 열기

            // 5. 파일로 저장하기
            // 인터넷 상에서 가져온 데이터 이미지를, 이미지명.png 로 복사해서 저장(.copy())
            Files.copy(inputStream, picture);
            inputStream.close(); // 저장 완료 후 inputStream 닫기

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제가 발생했습니다.");
        }

    }

    public void saveImg3(String imgName){
        Path memberFolder = Path.of("profiles", "member07");

        try {
            String imgUrl2 = "https://www.fitpetmall.com/wp-content/uploads/2023/10/shutterstock_1844153299-1024x683-1.png";

            Files.createDirectories(memberFolder);
            Path picture = Path.of("profiles", "member07", imgName);

            URL url = new URL(imgUrl2);
            InputStream inputStream = url.openStream();

            // 이미지를 복사해서 저장한다는 의미를 쓰는 이유
            // 웹에 있는 이미지를 그대로 복제해서 내 컴퓨터 안에 저장하는 것이기 때문
            // 웹에 있는 이미지를 내 컴퓨터 안에 저장한다 하여 웹에 존재하는 이미지가 사라지는 것은 아니기에
            // '웹 이미지를 복제하여 내 컴퓨터에 저장한다' => .copy() 를 사용함
            Files.copy(inputStream, picture); // 똑같은 이름의 이미지가 존재할 때 덮어쓰기 X
                                              // (StandardCopyOption.REPLACE_EXISTING 없기 때문)
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제가 발생했습니다.");
        }
    }

    // Scanner 를 이용하여 폴더이름, 이미지이름을 사용자에게 전달받고
    // 폴더 안에 이미지를 웹에서 복제하여 저장
    // 확장자는 .png 사용
    /*
    png = 투명도를 지원하는 비손실 압축
          로고, 아이콘 등 투명배경이 필요한 이미지 사용
          파일 크기가 크고, 여러 번 수정해야 할 때 주로 사용함.
    jpg = 투명도를 지원하지 않는 손실 압축
          사진, 그라데이션, 배너 등 완성된 사진을 압축하여 데이터 크기를 줄여 사용할 때 용이
    svg = 확장 가능한 이미지
          이미지를 아무리 확대하거나 축소해도 절대 깨지지 않는 디지털 이미지 형식
          수학 공식으로 이미지를 설계 (벡터 이미지 확장자)
          화면 크기에 맞춰 매번 공식을 다시 계산 후 표현되기 때문에, 다양한 디바이스에서 유용하게 사용되는 이미지.
          => 코드 기반 이미지!
     */
    // 외부 url 을 통해 이미지를 가져올 때, Java에서 접근할 수 없는 주소도 존재함.
    // -> 사이트마다 권한에 따른 문제임.
    //    이러한 주소에 접근하려면 추가적인 권한이 필요하기 때문에, 권한이 필요하다는 예외가 발생함.
    //    https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Oryctolagus_cuniculus_Tasmania_2.jpg/960px-Oryctolagus_cuniculus_Tasmania_2.jpg
    
    public void saveImg4(String folderName, String imageName, String imgUrl){
        Path memberFolder = Path.of("profiles", folderName);
        // Path memberFolder = Path.of("profiles", folderName, imageName);

        // String imgUrl = "https://cdn-icons-png.flaticon.com/512/3163/3163306.png";

        try {
            Files.createDirectories(memberFolder); // 폴더가 없을 경우 생성, 있으면 false로 넘어가기
            // Files.createDirectories(memberFolder.getParent()); // 이렇게도 가능!
            Path picture = Path.of("profiles", folderName, imageName); // 폴더 내의 이미지까지 바라보는 경로

            URL url = new URL(imgUrl);
            InputStream inputStream = url.openStream();
            Files.copy(inputStream, picture);
            inputStream.close();

            System.out.println("사진 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패");
            // 더 자세한 오류 정보 제공
            if(e.getMessage().contains("403")) {
                System.out.println("403 오류 : 위키미디어에서 접근을 거부했습니다. 함부러 들어와서 다운로드 할 수 없다네용...");
            }
        }
    }

}
