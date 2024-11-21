package Java_OriginEducation.CH04_Loop;

public class WhileForEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println("i = " + count);
            count++;
        }

        for (int j = 1; j <= 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
