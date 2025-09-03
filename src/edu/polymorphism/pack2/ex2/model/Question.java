package edu.polymorphism.pack2.ex2.model;

public class Question extends Post{
    // 필드
    private int answerCount;

    // 생성자
    public Question() {
    }
    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
        this.answerCount = 0; // answerCount 응답개수의 경우, 소비자한테 전달받는 것이 아니라 개발자가 첫 응답개수 지정.
    }

    // getter, setter
    public int getAnswerCount() {
        return answerCount;
    }

    // 메서드 재정의
    @Override
    public void displayPost() {
        System.out.println("[Q&A]");
        System.out.printf("{%s}" +
                "\n작성자: {%s}" +
                "\n답변 개수: {%d}" +
                "\n내용: {%s}", getTitle(), getAuthor(), getAnswerCount(), getContent());
    }
}
