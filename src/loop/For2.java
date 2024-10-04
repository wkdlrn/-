package loop;

public class For2 { //for문은 조건식이 없으면 무한 반복한다.

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum ; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
