package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진service;

public class 프로필사진run {
    public static void main(String[] args) {
        프로필사진service service = new 프로필사진service();

        // service.createProfileFolder("member03", "프로필사진2.png");
        // service.createProfileFolder("member04", "프로필사진2.png");

        String imgUrl = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";

        // service.saveImg(imgUrl);

        // 인터넷에서 이미지 주소를 복사한 후
        // 원하는 이미지를
        String imgUrl2 = "이미지 주소 넣어주기";
        service.saveImg2(imgUrl2);
    }
}
