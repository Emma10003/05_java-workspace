package edu.oop.cls.pack2;

import edu.oop.basic.Account;
import edu.oop.basic.Nation;
//import edu.oop.cls.pack1.ClassTest1;

// ClassTest1과 다른 패키지에 존재하는 클래스
public class OtherClassTestRun {
    public static void main(String[] args){

        // Nation과 Account는 public이기 때문에 다른 폴더에서도 접근 가능.
        Nation n = new Nation();
        Account a = new Account();

        // 다른폴더에 존재하기 때문에 import 불가능
        // why? -> default 로 접근 범위를 pack1 폴더 내에서만 호출할 수 있도록 제한했기 때문.
        // ClassTest1 obj = new ClassTest1();
    }
}
