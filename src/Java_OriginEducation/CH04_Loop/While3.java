package Java_OriginEducation.CH04_Loop;

public class While3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        // 1부터 endnum까지 더하는 프로그램 작성 -> while문 사용하여 간결하게 표현 가능!
        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }
    }
}
