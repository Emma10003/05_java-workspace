package edu.practice.day9;

import java.util.Map;

public class ProductManager {
    // 필드
    Map<String, String> productMap; // 상품ID : 상품명
    Map<String, Integer> priceMap;  // 상품ID : 가격

    // 메서드

    /**
     * 상품 추가 메서드
     * @param productId
     * @param productName
     * @param price
     */
    public void addProduct(String productId, String productName, int price){
        if(productMap.containsKey(productId)){ // 상품ID가 이미 존재하면
            System.out.println("이미 존재하는 상품입니다!");
        } else {
            productMap.put(productId, productName); // 상품명 추가
            priceMap.put(productId, price);         // 가격 추가
            System.out.println(productName + " 상품이 추가되었습니다!");
        }
    }

    /**
     * 상품 검색 메서드
     * @param productId : 상품 ID를 입력받고 productMap, priceMap 에서 각각 상품명과 가격을 가져옴.
     */
    public void searchProduct(String productId){
        if(productMap.containsKey(productId)){ // 상품ID가 존재하면
            System.out.printf("상품ID: %s, 상품명: %s, 가격: %d\n", productId, productMap.get(productId), priceMap.get(productId));
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    /**
     * 전체 상품 목록 출력
     */
    public void displayAllProducts(){
        System.out.println("=== 전체 상품 목록 ===");
        for(Map.Entry<String, String> entry : productMap.entrySet()) {
            System.out.printf("상품ID: %s 상품명: %s", entry.getKey(), entry.getValue());
            for(Map.Entry<String, Integer> entryPrice : priceMap.entrySet()){
                System.out.printf(", 가격: %d\n", entryPrice.getValue());
            }
        }
    }

    /**
     * 상품 삭제 메서드
     * @param productId
     */
    public void removeProduct(String productId){
        if(productMap.containsKey(productId)){
            productMap.remove(productId);   // productMap에서 삭제
            priceMap.remove(productId);     // priceMap에서 삭제
            System.out.println(productMap.get(productId) + " 상품이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 상품ID입니다.");
        }
    }
}
