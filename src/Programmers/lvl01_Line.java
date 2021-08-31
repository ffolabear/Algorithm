package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class lvl01_Line {
	
	/*
	 * 
	 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다. 점 3개의 좌표가 들어있는
	 * 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를
	 * 완성해주세요. 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다. 
	 * 
	 * 제한사항 
	 * v는 세 점의 좌표가 들어있는 2차원 배열입니다. 
	 * v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로 주어집니다.
	 * 좌표값은 1 이상 10억 이하의 자연수입니다. 
	 * 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표] 순으로 담아 return 해주세요.
	 * 
	 * 
	 *  [[1, 4], [3, 4], [3, 10]]  :	[1, 10]
	 *	[[1, 1], [2, 2], [1, 2]]   :	[2, 1]
	 * 
	 * 
	 */
	
	

	public static int[] solution(int[][] v) {
		
		
		int x;
		int y;

		if (v[0][0] == v[1][0]) {
			x = v[2][0];

		} else if (v[0][0] == v[2][0]) {
			x = v[1][0];
			
		} else {
			x =v[0][0];
		}
		
		

		if (v[0][1] == v[1][1]) {
			y = v[2][1];

		} else if (v[0][1] == v[2][1]) {
			y = v[1][1];
		} else {
			y = v[0][1];
		}
		
		int[] answer = {x,y};
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		return answer;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 4 }, { 3, 4 }, { 3, 10 } };

		System.out.println(arr.length);
		System.out.println(arr[0].length);

		System.out.print("arr[0][0] : " + arr[0][0] + "\n");
		System.out.print("arr[0][1] : " + arr[0][1] + "\n");
		System.out.print("arr[1][0] : " + arr[1][0] + "\n");
		System.out.print("arr[1][1] : " + arr[1][1] + "\n");
		System.out.print("arr[2][0] : " + arr[2][0] + "\n");
		System.out.print("arr[2][1] : " + arr[2][1] + "\n");

		solution(arr);
	}

}
