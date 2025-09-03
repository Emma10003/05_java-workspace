package edu.polymorphism.pack2.ex2.model;
// abstract : 부모클래스 내에는 상속받을 때 강제로 작성해야 하는 기능이 존재한다.
public abstract class Post {
    // 필드
    protected String postId; // 상속받은 클래스까지 접근 가능
    protected String title;
    protected String author;
    protected String content;

    // 생성자
    public Post() {
    }
    public Post(String postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // getter, setter
    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // 개발자 정의 메서드
    public void like(){
        System.out.println("{" + getTitle() + "} 게시글에 좋아요를 눌렀습니다.");
    }
    public void share(){
        System.out.println("{" + getTitle() + "} 게시글을 공유했습니다.");
    }
    public abstract void displayPost();
}

