package edu.exception.pack3.ex.run;

import edu.exception.pack3.ex.model.Cart;
import edu.exception.pack3.ex.service.CartService;

import java.util.Scanner;

public class CartRun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 ID를 입력하세요: ");
        String createUserId = sc.nextLine();

        Cart cart = new Cart(createUserId); // userId 를 갖고 있는 cart 공간이 생성

        CartService cartService = new CartService();
        // 둘 다 userId 를 가져옴 --> 현재는 html 대신 작성한 것이므로
        // cartService.장바구니시간체크기능(createUserId); // 나중에는 사용 불가능한 방법
        cartService.장바구니시간체크기능(cart.getUserId());
        // 나중에 html에서 가져온 데이터를 활용할 방법!
        //  --> 지금은 createUserId가 되지만, html을 사용하면서 데이터를 받아오는 추후에는
        //      cart.getUserId()만 사용 가능할 것!
    }
}
