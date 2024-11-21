package Java_OriginEducation.CH04_Loop;

public class Break2 {
    public static void main(String[] args) {
        // for문, break문을 사용하여 sum이 10을 초과했을 때 탈출!
        int sum = 0;
        int i = 1;

        for (;;) { // for (;;) : for문에 조건식이 없는 구조. while(true)와 동일한 코드. 무한 루프
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
