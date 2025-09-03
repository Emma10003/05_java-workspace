package edu.polymorphism.pack2.ex2.run;

import edu.polymorphism.pack2.ex2.service.PostService;

public class PostMain {
    public static void main(String[] args) {
        // 1단계 Notice Question Review 개별 객체 생성 후 다형성을 통해 공통된 기능 실행
        // 2단계 PostService 호출 후 display() 실행
        PostService postService = new PostService();
        postService.display();
    }
}
