package edu.polymorphism.pack2.ex1;

// 나중에 프로그램에서 알아서 만들어줌
// 프로젝트를 수행하기 위한 기능과 모델을 개발자가 작성!
public class MemberRun {
    // 실행 only, 모든 행동은 main 메서드 안에 작성
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.display();
    }
}
