package edu.practice.day9;

import java.util.Map;

public class MemberPointManager {
    // 필드
    Map<String, Integer> pointMap;  // 회원Id : 포인트

    // 메서드

    /**
     * 신규 회원 등록 메서드
     * @param memberId : 회원 ID
     */
    public void registerMember(String memberId) {
        if(pointMap.containsKey(memberId)){ // 이미 존재하면
            System.out.println("이미 존재하는 ID입니다.");
        } else {
            System.out.printf(memberId + "님이 신규 회원으로 등록되었습니다.\n");
            pointMap.put(memberId, 0);
        }
    }

    /**
     * 포인트 적립 메서드
     * @param memberId : 회원 ID
     * @param points : 적립할 포인트
     */
    public void earnPoints(String memberId, int points) {
        if(pointMap.containsKey(memberId)){
            pointMap.put(memberId, pointMap.get(memberId) + points); // 기존 포인트에 새로 입력된 포인트를 더한 뒤 pointMap에 저장
            System.out.printf("%s 님에게 %d 포인트가 적립되었습니다. 현재 포인트: %d\n", memberId, points, pointMap.get(memberId));
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    /**
     * 포인트 사용 메서드
     * @param memberId
     * @param points
     */
    public void usePoints(String memberId, int points) {
        if(pointMap.get(memberId) >= points) { // 포인트가 충분한 경우
            pointMap.put(memberId, pointMap.get(memberId) - points); // 포인트 차감
            System.out.printf("%s 님이 %d 포인트를 사용했습니다. 남은 포인트: %d\n", memberId, points, pointMap.get(memberId));
        } else if (pointMap.get(memberId) < points) {
            System.out.printf("포인트가 부족합니다. 현재 포인트: %d", pointMap.get(memberId));
        } else {
            System.out.println("존재하지 않는 회원 Id입니다.");
        }
    }

    public void displayAllMembers(){

    }
}
