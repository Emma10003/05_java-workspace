package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 9 : 배열 뒤집기
 * 사용자가 입력한 숫자들을 배열에 저장한 후, 순서를 뒤집어 새로운 배열을 만드는 프로그램을 작성하세요.
 * - 배열 크기를 사용자가 결정 (최대 10개)
 * - 원본 배열과 뒤집힌 배열을 모두 출력
 * - Arrays.toString() 사용하여 배열 출력
 * =====================================
 * <실행예시>
 * 배열 크기를 입력하세요 (1~10): 4
 * 1번째 숫자: 10
 * 2번째 숫자: 20
 * 3번째 숫자: 30
 * 4번째 숫자: 40
 *
 * 원본 배열: [10, 20, 30, 40]
 * 뒤집힌 배열: [40, 30, 20, 10]
 */
public class Practice9 {
    Scanner sc = new Scanner(System.in);
    int arraySize;
    int[] numbers;          // 원본배열
    int[] numbersReverse;   // 뒤집힌 배열

    public void method1(){
        System.out.print("배열 크기를 입력하세요 (1~10): ");
        arraySize = sc.nextInt();
        // 배열 크기 제한
        if(arraySize < 1 || arraySize > 10){
            System.out.println("1~10 사이의 숫자를 입력하세요: ");
            return;
        }
        numbers = new int[arraySize];
        numbersReverse = new int[arraySize];

        // 원본배열 입력받기
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("%d번째 숫자: ", i+1);
            numbers[i] = sc.nextInt();
            // 배열 뒤집기
            numbersReverse[arraySize-i-1] = numbers[i];
        }

        System.out.println("\n원본 배열: " + Arrays.toString(numbers));
        System.out.println("뒤집힌 배열: " +  Arrays.toString(numbersReverse));

    }
}
