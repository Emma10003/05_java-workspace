package edu.collection.pack3.service;

import java.util.HashMap;
import java.util.Map;

public class MapService {
    // Map : 특정 키워드(Key)를 입력하면
    //       해당되는 상세한 값(Value)를 얻을 수 있는 컬렉션 객체
    /**
     * K : V 형식으로 구성
     * K : V 한 쌍을 Entry(엔트리) 라고 부름
     *
     * Key : 키워드 역할 (== 변수 이름에 해당)
     * 1) 중복 불가         => 중복되는 Key 입력 시 Value를 덮어쓰기함
     * 2) 순서 유지 안됨
     *
     * Key 만 묶어서 보면 Set 과 같은 특징을 지니고 있음.
     * Map.keySet() / Map.EntrySet() 을 제공하여 key 내에 작성된 데이터를 수정할 수 있음.
     * 
     * Value : 키워드에 해당하는 상세한 데이터
     * - Key 로 인해서 모든 Value 가 구분됨
     *   => Map.get(Key) / Map.remove(Key) 형태로 사용
     */
    public void method1(){
        // HashMap 생성
        // map1 에는 '숫자, 문자열' 형태로 이루어진 데이터들이 와야 함.
        Map<Integer, String> map1 = new HashMap<>();
        
        // 1. V put(K k, V v) : Map 에 데이터를 추가하는 기능 (add가 아님!!!)
        // - Map 에 추가 시
        //      중복되는 Key 가 없으면 null
        //      중복되는 Key 가 있으면 이전 Value 반환
        System.out.println(map1.put(   1, "에그마요")); // null : 데이터가 저장되도 된다는 뜻! Map의 put() 결과에서는
                                                        // '비어있으니 데이터를 저장해도 됩니다' 라는 의미
    //  인덱스 아니고 key. 순서없음!  <─┘
        // Key는 개발자가 필요로하는 공간의 명칭. '에그마요'라는 데이터를 가져오기 위해 1이라는 숫자를 이용할 뿐, 1의 위치는 알 수 없음.
        System.out.println(map1.put(2, "로티세리바베큐")); // null
        System.out.println(map1.put(3, "스테이크앤치즈")); // null : '3이라는 키 명칭에 들어있는 데이터가 없습니다. (데이터 들어오는 것을 환영합니다!)' 같은 의미.
        System.out.println(map1.put(3, "스파이시쉬림프")); // key 3 이 중복 -> '스테이크앤치즈'

        System.out.println(map1);  // .toString()을 생략한 상태로 출력 가능
        // {1=에그마요, 2=로티세리바베큐, 3=스파이시쉬림프}
        // map 은 json 처럼 중괄호{} 형태
        // list 배열은      대괄호[] 형태 ~> 배열 모양


        // 2. V get(K k) : Key 에 해당되는 Value 반환
        //                 일치하는 Key가 없으며 null 반환
        System.out.println("-".repeat(20));
        System.out.println(map1.get(1)); // 에그마요
        System.out.println(map1.get(0)); // null 의 데이터를 반환

        String tmap1 = map1.get(2); // map1.get(2)의 데이터를 직접적으로 확인하는 것이 아니라
        System.out.println(tmap1);  // tmap1 이라는 공간에 담은 후 담겨있는 데이터를 확인하는 것.


        // 3. int size() : Map 에 저장된 Entry(K:V) 의 개수
        System.out.println("size: " + map1.size());
        
        
        // 4. V remove(K k) : Key 가 일치하는 Entry 를 제거
        //                    일치하는 Key 가 있다면 Value, 없다면 null 반환
        System.out.println("=".repeat(20));
        System.out.println("remove(2): " + map1.remove(2));
        System.out.println("remove(5): " + map1.remove(5));
        System.out.println(map1);


        // 5. void clear()      : 모든 Entry 삭제
        // 6. boolean isEmpty() : 비어있는지 확인
        System.out.println("clear() 전 isEmpty():" + map1.isEmpty()); // false : 데이터 들어있음
        map1.clear(); // 데이터 모두 지우기
        System.out.println("clear() 후 isEmpty():" + map1.isEmpty()); // true  : 데이터 존재하지 않음

    }
}
