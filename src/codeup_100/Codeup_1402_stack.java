package codeup_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Codeup_1402_stack {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String str = bf.readLine();
		
		String[] arr = str.split(" ");
		
		
		for(int i=arr.length -1 ; i>=0 ; i--) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		//----------------------------------- 스택으로 구현하기 ---------------------------------------
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0 ; i < N ; i++) {
			stack.push(Integer.parseInt(arr[i]));
		}
		
		for(int i=0 ; i < N ; i++) {
			System.out.print(stack.pop() + " ");
		}
		
		
		
	}
	

}