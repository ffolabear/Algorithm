package hackerrank;

import java.util.*;

public class Array_2D {

	private static final Scanner scanner = new Scanner(System.in);

	static int hourglass(int[][] arr) {

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length -2; j++) {

                int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                           arr[i + 1][j + 1] + 
                           arr[i + 2][j]+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
                
                
                sum = Math.max(sum, temp);

            }
        }

        return sum;
    }

	public static void main(String[] args) {

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		System.out.println(hourglass(arr));
		scanner.close();
	}

}
