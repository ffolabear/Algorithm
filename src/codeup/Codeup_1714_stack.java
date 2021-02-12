package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Codeup_1714_stack {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String N = bf.readLine();
		String[] arr = N.split(""); 
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		for(int i = 0; i < arr.length ; i++) {
			stack.push(Integer.parseInt(arr[i]));
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(stack.pop());
		}
		
		
	}

}
