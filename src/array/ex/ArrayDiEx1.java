package array.ex;

import java.util.Scanner;

public class ArrayDiEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] scores = new int [4][3];
        String [] subjects = {"국어", "영어", "수학"};
        int sum = 0;
        double average;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
                sum += scores[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total +=
            }
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average );
        }



    }
}
