package edu.oop.basic.ex;

public class ProductRun {
    public static void main(String[] args) {
        Product p1 = new Product("갤럭시 S24", 1200000, "삼성");
        Product p2 = new Product("아이폰 15", 1300000, "애플");

        System.out.println("=== p1 실행결과 ===");
        p1.information();
        System.out.println("=== p2 실행결과 ===");
        p2.information();
    }
}
