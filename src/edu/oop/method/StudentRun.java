package edu.oop.method;

public class StudentRun {
    public static void main(String[] args) {
        // StudentService ss = new StudentService();

        // 생성된 StudentService 객체를
        // ss라는 공간에 담아 지속적으로 사용하는 것이 아니라
        // 1번 사용하고 메모리에서 지워버리는 경우
        new StudentService().displayMenu();
    }
}
