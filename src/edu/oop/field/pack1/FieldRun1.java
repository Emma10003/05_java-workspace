package edu.oop.field.pack1;

public class FieldRun1 {
    public static void main(String[] args) {
        FieldEx f1 =  new FieldEx();

        System.out.println(f1.publicValue);
        System.out.println(f1.protectedValue);
        System.out.println(f1.defaultValueOne);
        /*
        // 다른 외부 클래스 파일에서 private 으로 작성된 변수이름에는 접근 불가
        'privateValue'이(가) 'edu.oop.field.pack1.FieldEx'에서 private 액세스를 가집니다.
        에러 발생
        System.out.println(f1.privateValue);
        */
    }
}
