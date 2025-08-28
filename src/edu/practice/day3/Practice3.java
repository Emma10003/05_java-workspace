package edu.practice.day3;

/**
 * 문제 3 : 은행계좌 업그레이드
 */
public class Practice3 {
    private String accountHolder;       // 예금주
    private String accountNumber;       // 계좌번호
    private long balance;               // 잔액
    private String password;            // 비밀번호
    private int transactionCount = 0;   // 거래횟수

    // 생성자
    public Practice3() {
    }
    public Practice3(String accountHolder, String accountNumber, long balance, String password) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    // setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    // getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    /**
     * 입금 (거래 횟수 증가)
     */
    public void deposit(long amount){
        // transactionCount++;
        setTransactionCount(getTransactionCount()+1);
        // balance += amount;
        setBalance(getBalance()+amount);
        System.out.println(getAccountHolder() + "님이 " + amount + "원 입금하셨습니다. " +
                "현재 잔액: " + balance + "원");
    }

    /**
     * 출금 (비밀번호 확인, 거래횟수 증가)
     */
    public void withdraw(String pw, long amount){
        if(!pw.equals(password)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }
        if(amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        transactionCount++;
        // balance -= amount; -> 연산할 때 사용하는 필드(private으로 선언된 변수)를 setter를 이용해서 작성.
        //                       () 안에는 balance 에서 amount를 빼는 연산을 하기 위해 getter 사용
        setBalance(getBalance()-amount);
        System.out.println(getAccountHolder() + "님이 " + amount + "원 출금하셨습니다. 현재 잔액: " + balance + "원");
    }

    /**
     * 계좌이체
     */
    public void transfer(String pw, String bankAccount, String targetAccount, long amount){
        if(!pw.equals(password)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }
        if(amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        transactionCount++;
        System.out.println(bankAccount + "님이 " + targetAccount + "님께 " + amount + "원 송금했습니다.");
    }

    /**
     * 총 거래횟수 출력
     */
    public void checkTransactionCount(){
        System.out.println("=== " + getAccountHolder() + "님 총 거래 횟수 ===");
        System.out.println("총 " + getTransactionCount() + "회 거래를 하셨습니다.");
    }

    /**
     * 계좌 정보 출력 (비밀번호 제외)
     */
    public void getAccountInfo(){
        System.out.println("=== " + getAccountHolder() + "님 계좌 정보 ===");
        System.out.println("계좌번호: " + getAccountNumber());
        System.out.println("잔액: " + getBalance() + "원");
        System.out.println("총 거래 횟수: " + getTransactionCount() + "회");
    }


}
