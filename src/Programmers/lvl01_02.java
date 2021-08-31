package Programmers;

import java.util.ArrayList;
import java.util.List;

public class lvl01_02 {
	
	/*
	 * 소수의 배수는 소수가 아니다.
	 * 	
	 */
	
	public static int solution(int n) {

		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		
		for(int i = 2; i<= n; i++) {
			for(int j=0; j<list.size(); j++) {
				if(i%list.get(j) ==0) break;
				 if(list.size() == j+1) list.add(i);
			}
		}
		
		System.out.println(list.size());
		return list.size();

	}

	public static void main(String[] args) {

		solution(5);
	}
	
	

}
