package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        }; // 2차원 배열 생성시 값을 넣으면서 생성


        //2중 for문을 통한 배열 출력
        for (int row = 0; row < arr.length; row++) { // arr.length 는 행의 길이
            for (int column = 0; column < arr[row].length; column++) { // arr[row].length는 열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
