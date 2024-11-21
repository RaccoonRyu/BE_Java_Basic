package Java_OriginEducation.CH04_Loop;

public class For2 {
    public static void main(String[] args) {
        // for문을 이용하여 1부터 endnum까지 더하기
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
