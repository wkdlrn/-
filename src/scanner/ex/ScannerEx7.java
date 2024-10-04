package scanner.ex;

import java.util.Scanner;

public class ScannerEx7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n인데 10만 가져가버림. -> \n이 남아서 다음에 이름이 ""으로 가져가게됨.
            input.nextLine(); //추가

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
