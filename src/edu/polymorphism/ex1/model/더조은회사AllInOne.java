package edu.polymorphism.ex1.model;

public class 더조은회사AllInOne {

    // Electronics -> Product 를 상속하고 필드와 생성자 완성
    // 기본, super만 전달받는 생성자, super + 자식클래스 필드 생성자


    // 전자제품 관련 메서드들
    public void displayElectronicsInfo() {
        if (productCategory.equals("전자제품")) {
            System.out.println("보증기간: " + warranty + "개월");
            System.out.println("전력소비량: " + powerConsumption);
        }
    }

    // 의류 관련 메서드들
    public void displayClothingInfo() {
        if (productCategory.equals("의류")) {
            System.out.println("사이즈: " + size);
            System.out.println("색상: " + color);
            System.out.println("소재: " + material);
        }
    }

    // 식품 관련 메서드들
    public void displayFoodInfo() {
        if (productCategory.equals("식품")) {
            System.out.println("유통기한: " + expirationDate);
            System.out.println("원산지: " + origin);
            System.out.println("유기농 여부: " + (isOrganic ? "유기농" : "일반"));
        }
    }

    public void checkFoodExpiration() {
        if (productCategory.equals("식품")) {
            System.out.println("유통기한을 확인하세요: " + expirationDate);
        }
    }

    // 구매 관련 메서드 (회원과 상품 정보를 모두 사용)
    public void purchaseProduct(int quantity) {
        if (this.productStock >= quantity) {
            double totalPrice = this.productPrice * quantity;

            // VIP 회원 할인
            if (memberGrade.equals("VIP")) {
                totalPrice *= 0.95; // 5% 할인
            } else if (memberGrade.equals("VVIP")) {
                totalPrice *= 0.9; // 10% 할인
            }

            this.productStock -= quantity;
            this.memberPoint += totalPrice * 0.01; // 1% 포인트 적립

            System.out.println(memberName + "님이 " + productName + " " + quantity + "개를 구매했습니다.");
            System.out.println("총 결제금액: " + totalPrice + "원");
            System.out.println("적립 포인트: " + (totalPrice * 0.01) + "점");
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    // 모든 정보를 출력하는 메서드
    public void displayAllInfo() {
        System.out.println("=== 회원 정보 ===");
        System.out.println("이름: " + memberName);
        System.out.println("ID: " + memberId);
        System.out.println("이메일: " + memberEmail);
        System.out.println("전화번호: " + memberPhone);
        System.out.println("주소: " + memberAddress);
        System.out.println("나이: " + memberAge);
        System.out.println("등급: " + memberGrade);
        System.out.println("포인트: " + memberPoint);

        System.out.println("\n=== 상품 정보 ===");
        displayProductInfo();

        if (productCategory.equals("전자제품")) {
            displayElectronicsInfo();
        } else if (productCategory.equals("의류")) {
            displayClothingInfo();
        } else if (productCategory.equals("식품")) {
            displayFoodInfo();
        }
    }


}
