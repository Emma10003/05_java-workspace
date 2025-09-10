package edu.io.pack5.run;

import edu.io.pack5.service.중복된_파일_폴더명칭_Service;

import java.util.Scanner;

public class 중복된_파일_폴더명칭_Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        중복된_파일_폴더명칭_Service service = new 중복된_파일_폴더명칭_Service();
        // service.saveImage1();
        // service.saveImage2();
        // service.saveImage3();
        // service.saveImage5();

        String imgUrl = "https://cdn-icons-png.freepik.com/512/6889/6889935.png";
        service.kakaoSave(imgUrl);
    }

}
