package edu.polymorphism.pack3.ex1;

/**
 * Meta플랫폼 클래스 -> 부모클래스를 추상클래스로 작성하면 굳이 인터페이스를 사용할 필요 없지만,
 *                     모두 같은 클래스로 작성하면 문서가 너무 길어지고 복잡해지기 때문에
 *                     부모클래스와 인터페이스로 분리한 것.
 *                     나중에는 부모클래스에 필드명, 생성자, getter, setter, toString만 있을 것!
 */
public class Instagram extends Meta플랫폼 /*implements 소셜미디어기능들*/ {

    public Instagram(String 유저아이디) {
        super("Instagram", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[Instagram] 릴스 게시물: " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[Instagram] 게시물: " + postId + " 에 하트를 눌렀습니다.");
    }
}
