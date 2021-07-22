package baekjoon.baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baek_2751_coll {
	
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		
		List<Integer> arr = new ArrayList<>();
		
		for(int i=0; i < N; i++) {
			
			arr.add(Integer.parseInt(bf.readLine()));
		}
		
		Collections.sort(arr);
		
		for(int i=0; i< N; i ++) {
			sb.append(arr.get(i)).append("\n");
		}
		
		System.out.println(sb);
		
		
		
		
	}

}
