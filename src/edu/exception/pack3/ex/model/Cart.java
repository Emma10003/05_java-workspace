package edu.exception.pack3.ex.model;

import java.time.LocalDateTime;

/*
장바구니 모델
 */
public class Cart {
    // 필드
    private String userId;
    private LocalDateTime createTime;

    // 생성자
    public Cart(String userId) {
        this.userId = userId;
        this.createTime = LocalDateTime.now(); // 장바구니 생성된 시간은 개발자가 설정!
        // => 현재 시간을 작성한다.
    }

    // getter, setter
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

}
