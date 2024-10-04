package cond.ex;

public class GradeEx {

    public static void main(String[] args) {
        String grade = "C";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");

        }
        /*if (grade == "A") {
            System.out.println("탁월한 성과입니다.");
        } else if (grade == "B") {
            System.out.println("좋은 성과입니다.");
        } else if (grade == "C") {
            System.out.println("준수한 성과입니다.");
        } else if (grade == "D") {
            System.out.println("향상이 필요합니다.");
        } else if (grade == "F") {
            System.out.println("불합격입니다.");
        } else {
            System.out.println("잘못된 학점입니다.");
        }*/
    }
}
