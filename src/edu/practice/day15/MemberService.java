package edu.practice.day15;

import java.util.List;

/**
 * 비즈니스 로직 클래스
 */
public class MemberService {
    // 필드 - 객체 생성
    private FileManager fileManager;
    private Member currentUser;
    
    // 생성자
    public MemberService() {
        this.fileManager = new FileManager();
        this.currentUser = null;
    }

    // 개발자 정의 메서드

    /**
     * 회원가입 메서드
     * @param id
     * @param password
     * @param name
     * @param email
     * @param phone
     * @param imageUrl
     * @return 회원가입 성공/실패 여부를 boolean 으로 반환
     */
    public boolean register(String id, String password, String name,
                            String email, String phone, String imageUrl) {
        // 1. isValidInput() 메서드로 입력값 검증
        // 2. isIdExists() 메서드로 ID 중복 검사
        // 3. 새 Member 객체 생성
        // 4. fileManager.saveMember() 호출
        // 5. 성공/실패 메시지 출력 후 boolean 반환

        boolean inputValidation = isValidInput(id, password, name, email, phone);
        boolean idValidation = isIdExists(id);

        // 회원가입 실패
        if(!(inputValidation && idValidation)) { // 하나라도 false라면
            System.out.println("회원가입에 실패했습니다.");
            return false;
        }

        currentUser = new Member(id, password, name, email, phone, imageUrl); // 새 멤버 객체 생성
        fileManager.saveMember(currentUser); // 멤버 저장
        
        return true;
    }

    /**
     * ID 중복 검사 메서드
     * @param id
     * @return id와 일치하는 회원이 있는지 여부 반환
     */
    public boolean isIdExists(String id) {
        // fileManager.loadAllMembers()로 전체 회원 목록 가져오기
        // id와 일치하는 회원이 있으면 true, 없으면 false
        
        List<Member> memberList = fileManager.loadAllMembers(); // List<Member> 형태로 반환
        if(memberList.contains(id)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 이미지 폴더 경로 반환 메서드
     * @return 이미지 폴더 경로
     */
    public String getImagesFolderPath(){
        // fileManager.getImagesDir().toString() 반환

        return fileManager.getImagesDir().toString();
    }

    private boolean isValidInput(String id, String password, String name,
                                String email, String phone) {
        // null 체크
        // trim() 후 길이 검사 (id: 3자 이상, password: 4자 이상)
        // 이메일에 "@" 포함 여부 확인
        // 전화번호 10자 이상 확인
        // 각 검증 실패 시 에러 메세지 출력

        // null 체크
        if(id == null || password == null ||
                name == null || email == null || phone == null) {
            System.out.println("비어있는 항목이 있습니다. 모든 항목을 작성해주세요.");
            return false;
        }

        // trim() 후 길이 검사
        if(id.trim().length() < 3) { // id
            System.out.println("이름은 3글자 이상이어야 합니다.");
        }
        if(password.trim().length() < 4) { // password
            System.out.println("비밀번호는 4글자 이상이어야 합니다.");
        }
        
        // 이메일에 "@" 포함 여부 확인
        if(!email.contains("@")) {
            System.out.println("이메일은 '@'를 반드시 포함해야 합니다.");
            return false;
        }

        // 전화번호 10자 이상 확인
        if(phone.trim().length() < 10) {
            System.out.println("입력한 전화번호를 다시 확인해 주세요.");
            return false;
        }

        return true;
    }
}
