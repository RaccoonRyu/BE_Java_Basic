package Java_OriginEducation.CH04_Loop;

public class WhileForEx3 {
    public static void main(String[] args) {
        int whileSum = 0;
        int whileNum = 1;
        int whileMax = 100;

        int forSum = 0;
        int forMax = 100;

        while(whileNum <= whileMax) {
            whileSum += whileNum;
            whileNum++;
        }
        System.out.println("whileSum = " + whileSum);

        for (int i = 1; i <= forMax; i++) {
            forSum += i;
        }
        System.out.println("forSum = " + forSum);
    }
}
