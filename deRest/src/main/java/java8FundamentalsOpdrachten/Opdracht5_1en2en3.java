package java8FundamentalsOpdrachten;

public class Opdracht5_1en2en3 {
    public static void main(String[] args) {
        boolean aBoolean = false;
        char aCharacter = 'd';
        byte aByte = 126;
        short aShort = 1568;
        //int anInteger = 1256456;
        //int anInteger = 0342;
        //int anInteger = 0x5631;
        //int anInteger = 0b1001_1100;

        long aLongInteger = 45631341L;
        float aDecimalNumber = 1256.32F;
        double aBigDecimalNumber = 12.365987451236;

        System.out.println(aBoolean);
        System.out.println(aCharacter);
        System.out.println(aByte);
        System.out.println(aShort);
        //System.out.println(anInteger);
        System.out.println(aLongInteger);
        System.out.println(aDecimalNumber);
        System.out.println(aBigDecimalNumber);

        final double PI = 3.14;
        //PI = 3.15;

        aByte = (byte) aShort;

    }
}
