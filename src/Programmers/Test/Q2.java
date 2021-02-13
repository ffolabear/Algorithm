package Programmers.lvl1_1;

public class Q2 {
	
	public String solution(int a, int b) {
		String answer = "";
		int endDay;
		int dayNum;
		
		if( a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12 ) {
			endDay = 31;
			
		} else if (a == 4 || a == 6 || a == 9 || a == 11 ) {
			endDay = 30;
			
		} else if (a == 2) {
			endDay = 29;
		}
		
		
		
		
		return answer;
	}

}
