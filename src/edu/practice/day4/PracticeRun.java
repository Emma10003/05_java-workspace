package edu.practice.day4;

public class PracticeRun {
    public static void main(String[] args) {
        System.out.println("=== Java 4일차 OOP 실습문제 실행 ===");

        // 문제 1: 학생 클래스
//         testPractice1();

        // 문제 2: 도서관 도서 관리
//         testPractice2();

        // 문제 3: 카페 주문 관리
         testPractice3();

        // 문제 4: 계산기 클래스
        // testPractice4();

    }

    /*public static void testPractice1() {
        System.out.println("\n=== 문제 1: 학생 클래스 테스트 ===");

        // 기본생성자로 생성
        Student s1 = new Student();
        s1.setName("김자바");
        s1.setStudentId("2024001");
        s1.setScore(85);

        // 필수생성자로 생성
        Student s2 = new Student("박코딩", "2024002", 45);

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }*/

    /*public static void testPractice2() {
        System.out.println("\n=== 문제 2: 도서 관리 테스트 ===");

        Book book = new Book("자바의 정석", "남궁성", "978-89-7914-726-9");

        System.out.println("도서명: " + book.getTitle());
        System.out.println("저자: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("상태: " + (book.isAvailable() ? "대출가능" : "대출중"));
        System.out.println();

        System.out.println("김자바님이 '" + book.getTitle() + "' 대출 시도");
        System.out.println("결과: " + book.borrowBook());
        System.out.println();

        System.out.println("박코딩님이 '" + book.getTitle() + "' 대출 시도");
        System.out.println("결과: " + book.borrowBook());
        System.out.println();

        System.out.println("김자바님이 '" + book.getTitle() + "' 반납");
        System.out.println("결과: " + book.returnBook());
    }*/

    public static void testPractice3() {
        System.out.println("\n=== 문제 3: 카페 주문 관리 테스트 ===");

        CafeOrder order1 = new CafeOrder();
        order1.setCustomerName("김자바");
        order1.setMenuItem("아메리카노");
        order1.setPrice(4000);
        order1.placeOrder();
        order1.printReceipt();

        CafeOrder order2 = new CafeOrder();
        order2.setCustomerName("박코딩");
        order2.setMenuItem("카페라떼");
        order2.setPrice(4500);
        order2.placeOrder();
        order2.printReceipt();

        System.out.println("현재 총 주문수: " + CafeOrder.totalOrders + "건");
        System.out.println("현재 총 매출: " + String.format("%,d", CafeOrder.totalSales) + "원");
    }
}
