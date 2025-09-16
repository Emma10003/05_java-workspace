package edu.practice.day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


/**
 * 파일 관리 클래스
 */
public class FileManager {
    // 필드 (static 상수)
    private static final Path MEMBER_FILE = Path.of("C:", "MemberSystem", "data", "members.txt");
    private static final Path IMAGES_DIR = Path.of("C:", "MemberSystem", "images");
    
    // 개발자 정의 메서드
    /**
     * 폴더 생성 메서드
     */
    public void createFolders(){
        // Files.createDirectories() 사용
        // 데이터 폴더와 이미지 폴더 생성
        // 생성 완료 메시지 출력

        try {
            Files.createDirectories(MEMBER_FILE.getParent()); // 데이터 폴더 생성
            System.out.println("데이터 폴더 생성이 완료되었습니다: " + MEMBER_FILE.getParent());
            Files.createDirectories(IMAGES_DIR.getParent());  // 이미지 폴더 생성
            System.out.println("이미지 폴더 생성이 완료되었습니다: " + IMAGES_DIR.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 회원 정보 저장 (추가) 하는 메서드
     * @param member Member 객체
     */
    public void saveMember(Member member) {
        // member.toFileFormat() + "\n"
        // Files.writeString() 사용
        // StandardOpenOption.CREATE, StandardOpenOption.APPEND 옵션

        // toFileFormat 에 작성했던 Scanner 입력을 여기서 받아야 하나...?
        // 그럴 경우 member.setId(sc.nextLine()); 이런 식으로 작성해야 하는지,,?
        // 변수에 따로 담은 뒤에 할 수도 있을 거 같긴 한데..

        // 1. member 객체를 .toFileFormat() 함수 사용해서 String으로 반환
        String memberInfo = member.toFileFormat() + "\n";
        createFolders();
        // 2. members.txt 에 회원정보 저장
        try {
            //
            Files.writeString(MEMBER_FILE, memberInfo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("회원 정보가 저장되었습니다: " + MEMBER_FILE.getFileName());
            System.out.println(Files.readString(MEMBER_FILE)); // 저장된 내용 보이기
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * 모든 회원 정보 읽기
     * @return Member 클래스 객체만 저장된 List 반환
     */
    public List<Member> loadAllMembers(){
        // Files.readAllLines() 사용
        // 각 줄을 Member.fromFileFormat() 으로 변환
        // 빈 줄 제외하고 List<Member> 로 반환
        
        List<String> memberLines = new ArrayList<>(); // 파일의 문자열들을 담아둘 List 객체
        List<Member> members = new ArrayList<>();     // 최종 return 할 List 객체
        Member member; // fromFileFormat() 메서드로 변환한 Member 클래스 객체

        try {
            // Files.readALlLines(파일경로) : 파일경로 내에 있는 내용을 String만 담길 수 있는 List로 반환
            memberLines = Files.readAllLines(MEMBER_FILE);
            System.out.println(memberLines); // memberLines 가 어떻게 나오는지 확인용

            for(int i = 0; i < memberLines.size(); i++) {
                if(!memberLines.isEmpty()) { // 읽어온 line 이 빈 줄이 아닐 때만
                    member = Member.fromFileFormat(memberLines.get(i));
                    members.add(member); // 읽어온 문자열을 member arrayList 에 추가
                }
            }

            return members; // Member 클래스 객체가 저장된 List 반환
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 이미지 폴더 경로를 반환하는 메서드
     * @return 이미지 폴더 경로
     */
    public Path getImagesDir() {
        return IMAGES_DIR;
    }
}
