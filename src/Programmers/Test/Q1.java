package Programmers.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String str = bf.readLine();
		String answer = "";
		
		String arr[] = str.split("");
		Arrays.sort(arr);
		
		for(int i = arr.length-1 ; i >=0; i--) {
			answer += arr[i];
		}
		System.out.println(answer);
	}

}
