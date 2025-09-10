package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진service;

import java.util.Scanner;

public class 프로필사진run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        프로필사진service service = new 프로필사진service();

        // 1. .saveImg()
        // service.createProfileFolder("member03", "프로필사진2.png");
        // service.createProfileFolder("member04", "프로필사진2.png");
        // String imgUrl = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";
        // service.saveImg(imgUrl);

        // 2. .saveImg2()
        // 인터넷에서 이미지 주소를 복사한 후
        // 원하는 이미지를 저장
        // String imgUrl2 = "https://www.fitpetmall.com/wp-content/uploads/2023/10/shutterstock_1844153299-1024x683-1.png";
        // service.saveImg2(imgUrl2);

        // 3. .saveImg3()
        // System.out.println("저장할 사진의 명칭을 작성하세요: ");
        // String name = sc.nextLine();
        //
        // String imgName = name + ".png"; // 확장자를 붙여서 저장
        // service.saveImg3(imgName);

        // 4. .saveImg4()
        System.out.print("사진의 주소: ");
        String imgUrl3 = sc.nextLine();
        System.out.print("폴더이름: ");
        String folderName = sc.nextLine();
        System.out.print("이미지 이름: ");
        String image = sc.nextLine();

        String finalName = image + ".png";
        service.saveImg4(folderName, finalName, imgUrl3);
    }
}
