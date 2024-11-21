package Java_OriginEducation.CH04_Loop;

public class Break1 {
    public static void main(String[] args) {
        // break
        // while, do-while, for 모든 반복문에서 사용 가능
        int sum = 0;
        int i = 1;

        while (true) { // while (true) : 무한 loop
            sum += i;

            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료. i = " + i + ", sum = " + sum);
                break; // 반복문을 즉시 종료하고 탈출
            }

            i++;
        }
    }
}
