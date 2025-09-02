package edu.polymorphism.ex3.model;
/*
구현해야 할 클래스
Animal
│─
│─
└─
 */

// 모든 동물을 하나의 클래스로 처리하는 나쁜 예시
public class AnimalBad {
    // 공통 필드
    private String name;
    private int age;
    private String color;
    private String type; // "개", "고양이", "새"

    // 개 전용 필드들
    private String breed; // 품종
    private boolean isTrained; // 훈련 여부

    // 고양이 전용 필드들
    private int livesLeft; // 남은 목숨 (9개)
    private boolean isIndoor; // 실내묘 여부

    // 새 전용 필드들
    private double wingSpan; // 날개 길이
    private boolean canFly; // 비행 가능 여부

    // 기본 생성자
    public AnimalBad() {
    }

    // 매개변수 생성자 - 파라미터가 너무 많음
    public AnimalBad(String name, int age, String color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;

        // 타입별로 초기화... 복잡함
        if (type.equals("개")) {
            this.breed = "믹스";
            this.isTrained = false;
            this.livesLeft = 0; // 사용 안 함
            this.isIndoor = false; // 사용 안 함
            this.wingSpan = 0.0; // 사용 안 함
            this.canFly = false; // 사용 안 함
        } else if (type.equals("고양이")) {
            this.livesLeft = 9;
            this.isIndoor = true;
            this.breed = null; // 사용 안 함
            this.isTrained = false; // 사용 안 함
            this.wingSpan = 0.0; // 사용 안 함
            this.canFly = false; // 사용 안 함
        } else if (type.equals("새")) {
            this.wingSpan = 30.0;
            this.canFly = true;
            this.breed = null; // 사용 안 함
            this.isTrained = false; // 사용 안 함
            this.livesLeft = 0; // 사용 안 함
            this.isIndoor = false; // 사용 안 함
        }
    }

    // 소리내기 - if-else 지옥
    public void makeSound() {
        if (type.equals("개")) {
            System.out.println(name + "이(가) 멍멍! 짖습니다.");
        } else if (type.equals("고양이")) {
            System.out.println(name + "이(가) 야옹~ 웁니다.");
        } else if (type.equals("새")) {
            System.out.println(name + "이(가) 짹짹! 웁니다.");
        }
    }

    // 움직이기 - 또 if-else
    public void move() {
        if (type.equals("개")) {
            System.out.println(name + "이(가) 네 다리로 달립니다!");
        } else if (type.equals("고양이")) {
            System.out.println(name + "이(가) 조용히 걸어갑니다.");
        } else if (type.equals("새")) {
            if (canFly) {
                System.out.println(name + "이(가) 날개를 펴고 날아갑니다!");
            } else {
                System.out.println(name + "이(가) 뛰어갑니다.");
            }
        }
    }

    // 특별 행동 - 역시 if-else...
    public void doSpecialAction() {
        if (type.equals("개")) {
            if (isTrained) {
                System.out.println(name + "이(가) 앉기를 합니다!");
            } else {
                System.out.println(name + "은(는) 아직 훈련이 안되었습니다.");
            }
        } else if (type.equals("고양이")) {
            System.out.println(name + "이(가) 그루밍을 합니다.");
            if (livesLeft > 0) {
                System.out.println("남은 목숨: " + livesLeft + "개");
            }
        } else if (type.equals("새")) {
            System.out.println(name + "이(가) 깃털을 다듬습니다.");
            System.out.println("날개 길이: " + wingSpan + "cm");
        }
    }

    // 먹이주기
    public void eat() {
        if (type.equals("개")) {
            System.out.println(name + "이(가) 사료를 먹습니다.");
        } else if (type.equals("고양이")) {
            System.out.println(name + "이(가) 참치캔을 먹습니다.");
        } else if (type.equals("새")) {
            System.out.println(name + "이(가) 씨앗을 먹습니다.");
        }
    }

    // getter/setter 메서드들 - 모든 필드에 대해 필요... 너무 많음
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // 개 전용
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public boolean isTrained() { return isTrained; }
    public void setTrained(boolean trained) { isTrained = trained; }

    // 고양이 전용
    public int getLivesLeft() { return livesLeft; }
    public void setLivesLeft(int livesLeft) { this.livesLeft = livesLeft; }
    public boolean isIndoor() { return isIndoor; }
    public void setIndoor(boolean indoor) { isIndoor = indoor; }

    // 새 전용
    public double getWingSpan() { return wingSpan; }
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; }
    public boolean isCanFly() { return canFly; }
    public void setCanFly(boolean canFly) { this.canFly = canFly; }

    @Override
    public String toString() {
        String result = "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", type='" + type + '\'';

        // 타입별로 다른 정보 추가... 복잡함!
        if (type.equals("개")) {
            result += ", breed='" + breed + '\'' +
                    ", isTrained=" + isTrained;
        } else if (type.equals("고양이")) {
            result += ", livesLeft=" + livesLeft +
                    ", isIndoor=" + isIndoor;
        } else if (type.equals("새")) {
            result += ", wingSpan=" + wingSpan +
                    ", canFly=" + canFly;
        }

        result += '}';
        return result;
    }


}
