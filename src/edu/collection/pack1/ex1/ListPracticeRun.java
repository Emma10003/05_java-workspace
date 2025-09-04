package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPracticeRun {
    // model, service, run 으로 나누지 않고 한 번에 실습
    // 메인메서드에서 모든 동작을 진행할 예정
    // 왜냐하면 List - ArrayList 를 단순히 익히기 위한 실습이기 때문에 한 번에 작성!
    public static void main(String[] args) {
        // problem1();  // function 이나 javascript 처럼 메서드 실행 가능.
        // problem2();
        // problem3();
        // problem4();
        problem5();
    }

    // void 앞에 static이 붙는다는 것은.. 변수명에 의해 호출되지 않고,
    // 기능들을 단독적으로 호출할 수 있도록 사용한다는 의미
    public static void problem1(){
        // 1. String 타입의 ArrayList를 생성하세요
        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        // 3. 리스트의 크기를 출력하세요
        // 4. 모든 취미를 출력하세요 (반복문 사용)

        List<String> strList = new ArrayList<>();
        strList.add("게임");
        strList.add("독서");
        strList.add("요리");

        System.out.println("strList의 크기: " + strList.size());

        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }

    public static void problem2(){
        // 1. Integer 타입의 ArrayList를 생성하세요
        // 2. 시험 점수 5개를 추가하세요 (85, 90, 78, 92, 88)
        // 3. 3번째 점수(인덱스 2)를 95로 수정하세요
        // 4. 수정 후 모든 점수를 출력하세요
        // 5. 가장 첫 번째 점수를 제거하고, 제거된 점수를 출력하세요

        List<Integer> intList = new ArrayList<>();
        intList.add(85);
        intList.add(90);
        intList.add(78);
        intList.add(92);
        intList.add(88);

        intList.set(2, 95);

        System.out.println("intList: " + intList);

        int target = intList.remove(0);
        System.out.println("제거된 점수: " + target);
    }

    public static void problem3(){
        // 1. 음식 메뉴 리스트를 만들고 다음 메뉴를 추가하세요
        //    "김치찌개", "된장찌개", "불고기", "비빔밥", "냉면"
        // 2. "불고기"가 몇 번째 인덱스에 있는지 출력하세요
        // 3. "라면"이 메뉴에 있는지 확인하세요 (true/false 출력)
        // 4. "김치찌개"가 메뉴에 있는지 확인하세요
        // 5. 마지막 메뉴("냉면")를 제거하고 결과를 출력하세요

        List<String> foodList = new ArrayList();
        foodList.add("김치찌개");
        foodList.add("된장찌개");
        foodList.add("불고기");
        foodList.add("비빔밥");
        foodList.add("냉면");

        System.out.println("'불고기'의 인덱스 번호: " + foodList.indexOf("불고기"));
        System.out.println("'라면'의 존재 여부: " + foodList.contains("라면"));
        System.out.println("'김치찌개'의 존재 여부: " + foodList.contains("김치찌개"));

        String target = foodList.remove(foodList.size()-1);
        /*
        List에 제너릭을 추가해주지 않으면
        필요한 타입: String   제공된 타입: Object
        에러 발생.
        */
        System.out.println("제거된 요소: " + target);
    }

    public static void problem4(){
        // 1. 쇼핑 카트 리스트를 만드세요
        // 2. "사과", "바나나", "우유" 를 추가하세요
        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        // 4. 2번째 상품을 "오렌지"로 바꾸세요
        // 5. 모든 상품을 "상품: 사과", "상품: 오렌지" 형태로 출력하세요

        List<String> cartList = new ArrayList();
        cartList.add("사과");
        cartList.add("바나나");
        cartList.add("우유");

        System.out.println("장바구니의 상품 개수: " + cartList.size());

        cartList.set(1, "오렌지");

        for(int i = 0; i < cartList.size(); i++){
            System.out.print("상품: ");
            System.out.println(cartList.get(i));
        }
    }

    public static void problem5(){
        // 1. 숫자 리스트를 만들고 [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] 을 추가하세요
        // 2. 짝수만 찾아서 출력하세요 (힌트: 숫자 % 2 == 0)
        // 3. 5보다 큰 숫자의 개수를 세어보세요
        // 4. 가장 큰 숫자를 찾아서 출력하세요

        List<Integer> numList = new ArrayList(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10));

        int numOverFive = 0;
        int numMax = numList.get(0);

        for(int i = 0; i < numList.size(); i++){
            // 짝수
            if(numList.get(i) % 2 == 0) {
                System.out.println(numList.get(i));
            }
            // 5보다 큰 숫자
            if(numList.get(i) > 5) {
                numOverFive++;
            }
            // 가장 큰 숫자
            numMax = Math.max(numMax, numList.get(i));
        }

        System.out.println("5보다 큰 숫자의 개수: " + numOverFive);
        System.out.println("가장 큰 숫자: " + numMax);


    }
}
