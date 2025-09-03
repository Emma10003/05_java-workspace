package edu.practice.day7.model;

public class KakaoPay extends KakaoService {
    // 필드
    private int balance;
    private String bankAccount;

    // 생성자
    public KakaoPay() {
    }
    public KakaoPay(String serviceName, String userId, String userNickname) {
        super(serviceName, userId, userNickname, true);
    }
    public KakaoPay(String serviceName, String userId, String userNickname,  int balance, String bankAccount) {
        super(serviceName, userId, userNickname, true);
        this.balance = balance;
        this.bankAccount = bankAccount;
    }
    
    // getter, setter
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    // 메서드 재정의

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("잔액: " + balance + "원");
        System.out.println("연결 계좌: " + bankAccount);

    }
    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오페이 알림] " + message);
    }


    // 추상메서드
    @Override
    public void startService() {
        System.out.println("카카오페이를 시작합니다. 간편결제 서비스가 준비되었습니다!");
        System.out.println("현재 잔액: " + getBalance() + "원");
    }
    @Override
    public void stopService() {
        System.out.println("카카오페이를 종료합니다. 결제 내역을 저장했습니다.");
    }
    @Override
    public String getServiceType() {
        return "";
    }
    @Override
    public void performSpecialAction() {

    }
    
    // 고유메서드
    public boolean processPayment(int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return false;
        }
        if (getBalance() >= amount) {
            balance -= amount;
            System.out.println(amount + "원 결제 완료. 잔액: " + getBalance() + "원");
            return true;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + getBalance() + "원");
            return false;
        }
    }

    public void refund(int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 환불 완료. 잔액: " + getBalance() + "원");
    }

    public int calBalance() {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return -1;
        }
        return balance;
    }

    public void chargeBalance(int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 충전 완료. 잔액: " + getBalance() + "원");
    }

    public void transferMoney(String recipient, int amount) {
        if (!"PAY".equals(getServiceType())) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        if (processPayment(amount)) {
            System.out.println(recipient + "에게 " + amount + "원 송금 완료");
        }
    }
}
