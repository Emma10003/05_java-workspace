package edu.exception.pack3.ex.service;

public class CartService {
    public void 장바구니시간체크기능(String userId){

        // 만약에 장바구니 보관 시간이 최대 30분인데, 30분을 초과했을 경우
        try {
            throw new CartTimeoutException("장바구니 보관 시간이 만료되었습니다. 30분 경과");
        } catch (CartTimeoutException e) {
            System.out.println("장바구니 시간이 만료되었으므로, 백엔드에서 가지고 있던 장바구니 데이터 지우기");
            clear장바구니(userId);
        }
    }
    
    public void clear장바구니(String userId){
        System.out.println(userId + " 사용자 장바구니 초기화 작업 시작 --- 아래 초기화를 위한 코드 작성");
    }
}
