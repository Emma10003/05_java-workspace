package edu.polymorphism.pack2.ex2.model;

import edu.polymorphism.pack2.ex2.service.PostService;

public class Notice extends Post {
    // 필드
    private String priority;

    // 생성자
    public Notice() {
    }
    public Notice(String postId, String title, String author, String content, String priority) {
        super(postId, title, author, content);
        this.priority = priority;
    }

    // getter, setter
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    // 메서드 재정의 - Post 클래스에서 강제로 작성해야 하는 메서드만 필수로 작성하기!
    @Override
    public void displayPost() {
        System.out.println("[공지사항]");
        System.out.printf("{%s}" +
                "\n작성자: {%s}" +
                "\n중요도: {%s}" +
                "\n내용: {%s}", getTitle(), getAuthor(), getPriority(), getContent());
    }
}
