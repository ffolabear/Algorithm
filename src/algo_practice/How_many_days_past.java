package algo_practice;

import java.util.Scanner;

public class How_many_days_past {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	
	static int isLeap(int year) {
		
		return(year % 4 == 0 && year % 100 ==0 && year % 400 ==0) ? 1:0;
		
	}
	
	static int dayOfYear(int y, int m, int d) {
		System.out.println("---------------------");
		
		
		int monthsPassed = 0;
		int daysPassed = 0;
		
		while( monthsPassed < m-1) {
			
			daysPassed += mdays[isLeap(y)][monthsPassed];
			
			System.out.println("지났던 일의 수: " + daysPassed);
			monthsPassed++;
			System.out.println("지났던 월의 수 : " + monthsPassed);
		}
		
		return daysPassed+d;
		
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		
		int monthsPassed = 0;
		int daysPassed = 0;
		
		while( --m != 0) {
			
			d += mdays[isLeap(y)][m - 1];
			
		}
		
		return 365 + isLeap(y) - d;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retry;
		
		
		do {
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.println("월 : "); int month = sc.nextInt();
			System.out.println("일 : "); int day = sc.nextInt();
			
			
			System.out.printf("그 해 %d 일 째입니다.\n", dayOfYear(year, month, day));
			
			System.out.printf("해당 해의 남일 일수는 %d 일 입니다.\n", leftDayOfYear(year, month, day));
			
			System.out.println("한번 더 할까요? (1: 예 / 0: 아니오) : ");
			retry = sc.nextInt();
			
		} while( retry ==1 );
		
		
	}

}
