package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //new int[행][열] 행2, 열3

        arr[0][0] = 1; // 1행 0열
        arr[0][1] = 2; // 1행 1열
        arr[0][2] = 3; // 1행 2열
        arr[1][0] = 4; // 2행 0열
        arr[1][1] = 5; // 2행 1열
        arr[1][2] = 6; // 2행 2열

        //2중 for문을 통한 배열 출력
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
