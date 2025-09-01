package edu.oop.method;

public class RPGGameWithoutMethods {
    // 전사 등급 계산 -> grade 함수명칭 중복코드 기능으로 분리 후 적용
    public static void main(String[] args) {
        // 전사 캐릭터 처리
        String warrior = "용감한 전사";
        int warriorLevel = 15;
        int warriorStr = 80;
        int warriorDef = 60;
        int warriorMagic = 20;

        // 전사 총 스탯 계산
        int warriorTotal = statCalculate(warriorStr, warriorDef, warriorMagic);

        // 전사 전투력 계산
        int warriorPower = powerCalculate(warriorStr, warriorDef, warriorMagic);

        // 전사 등급 계산
        String warriorRank = levelCalculate(warriorPower);

        // 전사 정보 출력
        System.out.println("🗡️ " + warrior + " (레벨 " + warriorLevel + ")");
        System.out.println("힘: " + warriorStr + " | 방어: " + warriorDef + " | 마법: " + warriorMagic);
        System.out.println("총 스탯: " + warriorTotal + " | 전투력: " + warriorPower);
        System.out.println("등급: " + warriorRank);
        System.out.println();


        // 마법사 캐릭터 처리 (완전히 동일한 로직)
        String mage = "현명한 마법사";
        int mageLevel = 12;
        int mageStr = 30;
        int mageDef = 40;
        int mageMagic = 95;

        // 마법사 총 스탯 계산
        int mageTotal = statCalculate(mageStr, mageDef, mageMagic);

        // 마법사 전투력 계산 (동일한 공식)
        int magePower = powerCalculate(mageStr, mageDef, mageMagic);

        // 마법사 등급 계산 (동일한 기준)
        String mageRank = levelCalculate(magePower);

        // 마법사 정보 출력 (동일한 형식)
        System.out.println("🔮 " + mage + " (레벨 " + mageLevel + ")");
        System.out.println("힘: " + mageStr + " | 방어: " + mageDef + " | 마법: " + mageMagic);
        System.out.println("총 스탯: " + mageTotal + " | 전투력: " + magePower);
        System.out.println("등급: " + mageRank);
        System.out.println();


        // 도적 캐릭터 처리 (또 다시 중복)
        String thief = "민첩한 도적";
        int thiefLevel = 18;
        int thiefStr = 55;
        int thiefDef = 45;
        int thiefMagic = 35;

        // 도적 총 스탯 계산
        int thiefTotal = statCalculate(thiefStr, thiefDef, thiefMagic);

        // 도적 전투력 계산 (또 다시 동일한 공식)
        int thiefPower = powerCalculate(thiefStr, thiefDef, thiefMagic);

        // 도적 등급 계산 (또 다시 동일한 기준)
        String thiefRank = levelCalculate(thiefPower);

        // 도적 정보 출력 (또 다시 동일한 형식)
        System.out.println("🗡️ " + thief + " (레벨 " + thiefLevel + ")");
        System.out.println("힘: " + thiefStr + " | 방어: " + thiefDef + " | 마법: " + thiefMagic);
        System.out.println("총 스탯: " + thiefTotal + " | 전투력: " + thiefPower);
        System.out.println("등급: " + thiefRank);
        System.out.println();


        // 파티 전체 정보
        System.out.println("🎮 파티 정보 🎮");
        System.out.println("파티원 수: 3명");
        System.out.println("평균 레벨: " + (warriorLevel + mageLevel + thiefLevel) / 3);
        System.out.println("총 전투력: " + (warriorPower + magePower + thiefPower));

        // 최강 캐릭터 찾기
        if (warriorPower >= magePower && warriorPower >= thiefPower) {
            System.out.println("최강 캐릭터: " + warrior + " (전투력: " + warriorPower + ")");
        } else if (magePower >= warriorPower && magePower >= thiefPower) {
            System.out.println("최강 캐릭터: " + mage + " (전투력: " + magePower + ")");
        } else {
            System.out.println("최강 캐릭터: " + thief + " (전투력: " + thiefPower + ")");
        }
    }

    /**
     * 스탯 계산 메서드
     * @param str
     * @param def
     * @param magic
     * @return str + def + magic
     */
    public static int statCalculate(int str, int def, int magic) {
        return str + def + magic;
    }

    public static int powerCalculate(int str, int def, int magic) {
        return (str * 2) + def + (magic / 2);
    }

    /**
     * 등급 계산 메서드
     * @param power
     * @return
     */
    public static String levelCalculate(int power){
        if (power >= 200) {
            return "전설급";
        } else if (power >= 150) {
            return "영웅급";
        } else if (power >= 100) {
            return "고수급";
        } else {
            return "초보급";
        }
    }
}
