package Algo_practice;

import java.util.Scanner;

public class WhatDay {

	int y;
	int m;
	int d;

	// 윤년일때 날짜를 바꿈
	static int[][] mdays = {

			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }

	};

	// 윤년일 경우에 1을 리턴
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) ? 1 : 0;
	}

	WhatDay(int y, int m, int d) {

		this.y = y;
		this.m = m;
		this.d = d;

	}
	
	

	WhatDay after(int n) {

		WhatDay temp = new WhatDay(this.y, this.m, this.d);
		
		if(n < 0) {
			return (before(-n));
		}
		
		
		temp.d += n;
		
		
		
		// 만약 주어진 날짜가 그 달의 일수 보다 크거나 같다면
		if( temp.d > mdays[isLeap(temp.y)][temp.m -1]) {
			
			temp.d -= mdays[isLeap(temp.y)][temp.m-1];
			
			
			if( temp.m == 12) {
				
				temp.y ++;
				temp.m = 1;
				
			} else {
				temp.m++;
			}
			
			
		} 
		
		return temp;

	}

	WhatDay before(int n) {
		
		WhatDay temp = new WhatDay(this.y, this.m, this.d);

		if (n < 0) {

			return (after(-n));

		}
		
		temp.d -= n;
		
		// 만약 주어진 날짜가 음수라면, 즉 전달로 가야한다면
		if(temp.d <= 0) {
			
			temp.d = mdays[isLeap(temp.y)][temp.m - 2] - (temp.d)*(-1); 
			
			if(temp.m == 1) {
				
				temp.m = 12;
			} else {
				temp.m--;
			}
		}
		

		return temp;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = sc.nextInt();
		System.out.print("월：");
		int m = sc.nextInt();
		System.out.print("일：");
		int d = sc.nextInt();
		
		WhatDay date = new WhatDay(y,m,d);
		
		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		
		
		int n = sc.nextInt();
		
		
		WhatDay afterDay = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, afterDay.y,afterDay.m, afterDay.d);
		
		WhatDay beforeDay = date.before(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, beforeDay.y,beforeDay.m, beforeDay.d);

	}

}








