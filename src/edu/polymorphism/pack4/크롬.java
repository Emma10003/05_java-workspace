package edu.polymorphism.pack4;

public class 크롬 extends 구글서비스{
    
    // 생성자
    public 크롬() {
        super("크롬");
    }

    // 개발자 정의 메서드
    public void 브라우저(String url) {
        System.out.println(url + " 로 이동합니다.");
    }
}
