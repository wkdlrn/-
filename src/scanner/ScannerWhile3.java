package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0을 입력하면 프로그램을 종료합니다.");
        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요:");
            int num = scanner.nextInt();

            if(num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum = sum + num;

        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
