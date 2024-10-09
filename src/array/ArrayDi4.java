package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        //2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; //후위 증감 연산자 => 값을 먼저 대입한 다음에 증가함.
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }




    }
}
