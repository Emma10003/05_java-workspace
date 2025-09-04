package edu.collection.pack1.ex1;

public class ListPracticeRun {
    // model, service, run 으로 나누지 않고 한 번에 실습
    // 메인메서드에서 모든 동작을 진행할 예정
    // 왜냐하면 List - ArrayList 를 단순히 익히기 위한 실습이기 때문에 한 번에 작성!
    public static void main(String[] args) {
        problem1();  // function 이나 javascript 처럼 메서드 실행 가능.
    }

    // void 앞에 static이 붙는다는 것은.. 변수명에 의해 호출되지 않고,
    // 기능들을 단독적으로 호출할 수 있도록 사용한다는 의미
    public static void problem1(){
        System.out.println("제대로 단독실행 가능한지 확인");
    }
}
