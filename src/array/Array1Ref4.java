package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int [] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화
        /*int [] students;
        students = {90, 80, 70, 60, 50}*/ //=>이렇게는 안됨.

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { //students.length = 배열의 길이
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }


    }
}
