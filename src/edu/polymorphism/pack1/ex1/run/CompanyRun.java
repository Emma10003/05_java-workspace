package edu.polymorphism.pack1.ex1.run;

import edu.polymorphism.pack1.ex1.service.MemberService;
import edu.polymorphism.pack1.ex1.service.ProductService;

public class CompanyRun {
    public static void main(String[] args) {
        
        ProductService ps = new ProductService(); // ps = ProductService 에 대한 기능이 담긴 공간의 명칭
        ps.info(); // ProductService 내에 존재하는 info() 기능 실행.

        MemberService ms = new MemberService();
        ms.info();
    }
}
