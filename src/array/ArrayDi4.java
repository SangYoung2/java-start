package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 배열에 크기에 맞춰 i값을 배열 안에 넣기
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; // 후위증감 연산자를 사용하여 값을 넣어준 후에 증감
            }
        }


        //2중 for문을 통한 배열 출력
        for (int row = 0; row < arr.length; row++) { // arr.length 는 행의 길이
            for (int column = 0; column < arr[row].length; column++) { // arr[row].length는 열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
