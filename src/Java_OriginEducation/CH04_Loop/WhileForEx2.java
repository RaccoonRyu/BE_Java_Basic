package Java_OriginEducation.CH04_Loop;

public class WhileForEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println("num = " + num);
            num += 2;
            count++;
        }

        for (int i = 2; i <= 20; i+=2) {
            System.out.println("i = " + i);
        }
    }
}
