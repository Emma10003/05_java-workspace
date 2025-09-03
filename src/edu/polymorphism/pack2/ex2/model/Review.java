package edu.polymorphism.pack2.ex2.model;

public class Review extends Post {
    // 필드
    private int rating;

    // 생성자
    public Review() {
    }
    public Review(String postId, String title, String author, String content, int rating) {
        super(postId, title, author, content);
        this.rating = rating;
    }

    // getter, setter
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void displayPost() {
        System.out.println("[후기]");
        System.out.printf("{%s}" +
                "\n작성자: {%s}" +
                "\n평점: {%d}/5점" +
                "\n내용: {%s}", getTitle(), getAuthor(), getRating(), getContent());
    }

}
