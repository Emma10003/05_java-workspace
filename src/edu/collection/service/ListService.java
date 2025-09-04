package edu.collection.service;

import java.util.ArrayList;
import java.util.List;

// service.ListService => 폴더와 클래스 한 번에 만들기
public class ListService {
    // List : 자료를 순차적으로 나열한 자료구조 (배열과 비슷)]
    // - 인덱스가 존재함
    //    => 인덱스로 순서가 구분되기 때문에 중복되는 데이터를 저장할 수 있다.
    //   인덱스란? 0번부터 순차적으로 변수명이나 데이터들의 자리번호를 생성하는 것.
    //    for문 작성 시 사용하는 i : index의 약자로 많이 사용됨.

    public ListService() {
    }

    /**
     * List 사용해보기 -> Array 보다 편리함
     */
    public void method1(){
        // List 객체 생성
        // - List(인터페이스) : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정
        //          => 인터페이스이기 때문에 객체 생성 불가 ~> 다형성을 이용해 사용할 것!
        // - ArrayList(클래스) 가 존재 -- List 의 후손 클래스.

        List list = new ArrayList(); // ArrayList 는 고무줄처럼 공간이 늘었다 줄었다 하기 때문에
                                     // 처음부터 몇 칸인지 설정하지 않아도 됨.

        list.add(1);
        list.add("아무거나 작성합니다.");
        System.out.println("list: " + list);
    }
}
