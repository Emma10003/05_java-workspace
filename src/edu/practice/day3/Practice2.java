package edu.practice.day3;

/**
 * 문제 2 : 스마트폰 클래스
 */
public class Practice2 {
    private String model;
    private int batteryLevel = 100;
    private boolean isPowerOn = false;

    // 기본생성자
    public Practice2() {
    }

    // 필수생성자
    public Practice2(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    // getter
    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    /* 메서드 */

    /**
     * 전원 On
     */
    public void powerOn(){
        System.out.println(getModel() + "의 전원이 켜졌습니다.");
        isPowerOn = true;
        phoneStatus();
    }

    /**
     * 배터리가 0%가 되면 전원이 꺼짐
     */
    public void powerOff(){
        System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
        isPowerOn = false;
    }

    /**
     * 배터리 사용량 출력
     */
    public void useBattery(int usedBattery){
        System.out.println("배터리를 " + usedBattery + "% 사용했습니다.");
        batteryLevel -=  usedBattery;
        phoneStatus();
        if(batteryLevel == 0){
            powerOff();
        }
    }

    /**
     * 배터리 충전
     */
    public void charge(int chargedBattery){
        batteryLevel += chargedBattery;
        if(getBatteryLevel() > 100) {
            batteryLevel -= chargedBattery;
            System.out.println("더 이상 충전할 수 없습니다.");
            return;
        }
        System.out.println(chargedBattery + "% 충전되었습니다.");
        phoneStatus();
    }

    /**
     * 핸드폰 상태 출력
     */
    public void phoneStatus(){
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + getModel());
        System.out.println("배터리: " + getBatteryLevel() + "%");
        System.out.println("전원 상태: " + (isPowerOn ? "ON" : "OFF"));
        System.out.println();
    }

}
