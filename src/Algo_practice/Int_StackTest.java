package Algo_practice;

import java.util.Scanner;


public class Int_StackTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Int_Stack s = new Int_Stack(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.print("(1)푸시   (2)팝         (3)피크 \n" + 
			                 "(4)검색   (5)검색       (6)초기화\n" + 
			                 "(7)정보표시             (9)출력\n" +
			                 "(0)종료 : ");

			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			
			case 1: //푸시
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (Int_Stack.OverFlowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			
			case 2: //팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
					
				} catch (Int_Stack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			
			case 3: //피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
					
				} catch (Int_Stack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			
			case 4: //검색
				System.out.print("찾는 데이터 : ");
				x = sc.nextInt();
				int n = s.indexOf(x);
				
				try {
					System.out.println("꼭대기부터 " + (s.size() - n) + "에 있습니다.");
				} catch (Exception e) {
					System.out.println("데이터를 찾을 수 없습니다.");
				}
				break;
				
			case 5: //비움
				s.clear();
				System.out.println("스택을 초기화 하였습니다.");
				break;
				
			case 6:
				System.out.println("스택의 용량은 " + s.capacity() + " 입니다.");
				break;
				
			case 7:
				System.out.println("용량 : " + s.capacity());
				System.out.println("데이터 수 : " + s.size());
				System.out.println("비어" + (s.isEmpty() ? "있습니다." : "있지않습니다."));
				System.out.println("가득" + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
				break;
			}
		}
	}
}
