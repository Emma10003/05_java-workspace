package edu.collection.pack1.model;
// 클래스 생성 시 model.Book 와 같은 형식으로 작성하면 model이라는 패키지와 Book 클래스가 동시에 생성됨.
public class Book {
    // 필드 (= 속성, 인스턴스 변수)
    private String title;   // 제목
    private String writer;  // 저자
    private int price;      // 가격

    /* 메서드 */
    // 아래 작성한 모든 기능들은 추후 @생성자, @파라미터생성자, @Getter, @Setter, @toString 과 같은 형태로
    // 가볍고 편하게 작성할 예정.

    // 생성자
    public Book() {
    }
    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    // getter, setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // 개발자들이 만드는 모든 클래스는 extends Object 문서를 상속받는 게 기본!
    // 직접 extends Object 를 작성하지 않아도 무조건 자동으로 설정됨.
    // Object 클래스 문서 내에는 개발자들이 공통적으로 필요로 하는 기능들이 작성되어 있음.
    // 그 중 대표적으로 가장 많이 사용하는 것이 toString.
    @Override
    public String toString() {
        return "Book [title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price + ']';
    }
}
