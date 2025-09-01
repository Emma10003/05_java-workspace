package edu.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {

        // html 에서 사용자에게 전달할 데이터나, 사용자가 작성한 데이터를
        // setter 와 getter 를 활용해서 가져오고 전달하는 기능 수행
        // 회원객체생성, 객체명은 m      기본생성자 - 매개변수 없음
           Member m                = new Member();

           // html 에서 기입한 회원정보를 가져옴
           // 가입할 때, 기입한 email이 DB에 이미 존재하는지 확인하고 저장

        if("데이터베이스의 email 컬럼에 사용자가 작성한 이메일이 존재한다면" == "") {
            // return "이미 존재하는 이메일입니다.";
        }
        // 이메일이 존재하지 않음
        // m.setEmail(); // 사용자가 작성한 이메일에 대해, 이메일이 DB에 이미 존재하는지 개발자가 확인하고 검증한 뒤 OK 되면
                      // DB에 저장하기 전에 Java에서 데이터를 담아두도록 설정.

        if("데이터베이스에서 nickname 컬럼에 사용자가 원하는 닉네임이 존재한다면(누군가 그 닉네임을 이미 쓰고 있다면)" == "") {
            // return "이미 사용중인 닉네임입니다. 를 html에 전달해주기";
        }
        // 닉네임이 존재하지 않음
        // m.setNickname(); // DB에 저장하기 전에 Java에서 데이터를 담아두도록 설정.

        // 추후 set으로 가져오거나 매개변수 생성자로 가져온 데이터를 DB에 저장하는 로직 작성.
    }
}
