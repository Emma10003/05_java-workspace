package edu.practice.day3;

/**
 * 문제 5 : 자동차 관리 시스템
 */
public class Practice5 {
    private String brand;
    private String model;
    private int fuel = 100;
    private int speed = 0;
    private boolean isEngineOn = false;
    private int totalDistance = 0;

    // 생성자
    public Practice5() {
    }

    public Practice5(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Practice5(String brand, String model, int fuel, int speed, boolean isEngineOn, int totalDistance) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.speed = speed;
        this.isEngineOn = isEngineOn;
        this.totalDistance = totalDistance;
    }

    // setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    // getter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    /* 메서드 */

    /**
     * 엔진 시동 (연료 체크 후 시동)
     */
    public void startEngine(){
        if(isEngineOn){
            System.out.println("이미 시동이 걸려있습니다.\n");
            return;
        }
        if(fuel > 0) {
            System.out.println(getModel() + " 엔진이 시동되었습니다.\n");
            isEngineOn = true;
        } else {
            System.out.println("연료가 부족하여 시동을 걸 수 없습니다.\n");
        }
    }

    /**
     * 엔진 정지
     */
    public void stopEngine(){
        isEngineOn = false;
        System.out.println(getModel() + " 엔진이 정지되었습니다.\n");
    }

    /**
     * 가속 (엔진 켜진 상태에서만, 연료 소모)
     * @param speedUp 올릴 속도
     */
    public void accelerate(int speedUp) {
        if(!isEngineOn) {
            System.out.println("엔진이 꺼져있어 가속할 수 없습니다.\n");
            return;
        }
        if(fuel <= 0) {
            System.out.println("연료가 없어 가속할 수 없습니다.\n");
        }
        speed += speedUp;
        System.out.println(speedUp + "km/h 가속했습니다. 현재 속도 : " + getSpeed() + "km/h\n");
    }

    /**
     * 감속
     * @param speedDown 내릴 속도
     */
    public void brake(int speedDown){
        if(!isEngineOn) {
            System.out.println("엔진이 꺼져있어 감속할 수 없습니다.\n");
        }
        System.out.println(speedDown + "km/h 감속했습니다. 현재 속도 : " + speed + "km/h\n");
    }

    /**
     * 주유
     * @param amount 주유할 연료량
     */
    public void refuel(int amount) {
        fuel += amount;
        System.out.println(amount + "L 주유했습니다. 현재 연료량 : " + getFuel() + "\n");
    }

    /**
     * 주행
     * @param distance 주행할 거리
     */
    public void drive(int distance){
        int fuelNeeded = distance / 10;
        if(fuel < fuelNeeded){
            System.out.println("연료가 부족하여 " + distance + "km를 주행할 수 없습니다.\n");
            return;
        }
        totalDistance += distance;
        fuel -= fuelNeeded;
        System.out.println(distance + "km 주행했습니다. 연료 " + fuelNeeded + "L 소모되었습니다.\n");
        if(fuel <= 0) {
            System.out.println("연료가 모두 소모되었습니다. 엔진을 정지합니다.\n");
        }
    }

    /**
     * 자동차 현재 상태 출력
     */
    public void displayCarInfo(){
        System.out.println("=== 자동차 정보 ===");
        System.out.println("브랜드: " + getBrand());
        System.out.println("모델: " + getModel());
        System.out.println("연료량: " + getFuel() + "L");
        System.out.println("속도: " + getSpeed() + "km/h");
        System.out.println("엔진상태: " + (isEngineOn ? "ON" : "OFF"));
        System.out.println("총 주행거리: " + getTotalDistance() + "km");
        System.out.println();
    }
}
