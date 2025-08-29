package edu.practice.day4;

/**
 * 도서관 도서 관리 클래스
 */
public class Book {
    /* 필드 */
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    /* 생성자 */
    public Book() {
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // 초기화
    {
        isAvailable = true;
    }

    /* 메서드 - getter, setter */
    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /* 메서드 - 개발자 정의 */

    /**
     * 대출 가능하면 상태(isAvailable) 변경 후 "대출 성공", 불가능하면 "이미 대출중"
     */
    public String borrowBook(){
        String result;

        if(isAvailable){
            isAvailable = false;
            result = "대출 성공";
        } else {
            isAvailable = true;
            result = "이미 대출중";
        }
        return result;
    }

    /**
     * 반납 처리 후 "반납 완료"
     */
    public String returnBook(){
        String result;
        isAvailable = true;
        result = "반납 완료";
        return result;
    }
}
