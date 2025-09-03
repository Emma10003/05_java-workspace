package edu.polymorphism.pack3.ex1;

// 인터페이스로 작성한 Java 문서는 추후 다른 클래스에서 각각의 클래스에 맞게 재사용해서 작성.
// public 이외의 모든 접근제어자 금지!
public interface 소셜미디어기능들 {
    void post(String content);
    void like(String postId);

}
