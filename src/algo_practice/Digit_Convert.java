package algo_practice;

import java.util.Scanner;

public class Digit_Convert {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int deci;
		int conv;
		char[] newNum = new char[32];
		int dno;
		
		System.out.println("어떤 숫자를 변환할까요?");
		do {
			System.out.println("0이 아닌 양의 숫자만 입력해주세요.");
			deci = sc.nextInt(); 
			
		} while( deci <= 0);
		
		System.out.println("어떤 진법으로 변환할까요?");
		do {
			System.out.println("2 ~ 32사이의 정수만 입력해주세요.");
			conv = sc.nextInt();
			
		} while( conv <2 || conv > 32 );
		
		
		dno = convert(deci, conv, newNum);
		
		for(int i=0; i < dno; i++) {
			System.out.println("newNum[" + i + "] : " + newNum[i]);
		}
		
		
		
	}
	
	
	static int convert(int deci, int conv, char[] newNum) {
		
		String arr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int digit = 0;
		
		
		do {
			newNum[digit++] = arr.charAt(deci% conv);
			deci /= conv;
			
		} while (deci != 0);
		
		
		for(int i=0; i < digit; i++) {
			
			char temp = newNum[i];
			newNum[i] = newNum[digit -i-1];
			newNum[digit -i-1] = temp;
			
		}
		
		return digit;
	}
	

}













