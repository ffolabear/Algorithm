package baekjoon.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baek_10773_stack {

	public static void main(String[] args) throws Exception, IOException {

		Stack<Integer> stack = new Stack<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(br.readLine());
		int total=0;
		
		for (int i = 0; i < K; i++) {

			int num = Integer.parseInt(br.readLine());

			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}

		int size = stack.size();
		for(int i=0; i<size; i++) {
			total += stack.pop();
		}
		
		bw.write(total + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
